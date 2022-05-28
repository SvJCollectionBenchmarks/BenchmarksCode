package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
@State(Scope.Benchmark)
public  class J_SetsConwayGeneralSets_Benchmark {
	
static class Cell {
	private final int row, column;
	private final boolean isAlive;
	private Cell(int row, int column, boolean isAlive) {
		this.row = row;
		this.column = column;
		this.isAlive = isAlive;
	}
	public static Cell livingCell(int row, int column) {
		return new Cell(row, column, true);
	}
	public static Cell deadCell(int row, int column) {
		return new Cell(row, column, false);
	}
	public int row() {
		return row;
	}
	public int column() {
		return column;
	}
	public boolean isAlive() {
		return isAlive;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Cell cell = (Cell) o;
		return row == cell.row && column == cell.column && isAlive == cell.isAlive;
	}
	@Override
	public int hashCode() {
		return Objects.hash(row, column, isAlive);
	}
}
private static final List<Cell> startingPoint = Arrays.asList(
	Cell.livingCell(0,0), Cell.livingCell(1,0), Cell.livingCell(2,0),
	Cell.livingCell(3,1),
	Cell.livingCell(1,2), Cell.livingCell(2,2),
	Cell.livingCell(3,3),
	Cell.livingCell(0,4), Cell.livingCell(1,4), Cell.livingCell(2,4)
);
private static void addLivingCell(Set<Cell> collection, int row, int column) {
	collection.remove(Cell.deadCell(row, column));
	collection.add(Cell.livingCell(row, column));
	for (int i = -1; i < 2; i++) {
		for (int j = -1; j < 2; j++) {
			if (!(i == 0 && j == 0) && !collection.contains(Cell.livingCell(row+i, column+j)))
				collection.add(Cell.deadCell(row+i, column+j));
		}
	}
}
private static void removeLivingCell(Set<Cell> collection, int row, int column) {
	collection.remove(Cell.livingCell(row, column));
	if (neighboursCount(collection, row, column) != 0)
		collection.add(Cell.deadCell(row, column));
	for (int i = -1; i < 2; i++) {
		for (int j = -1; j < 2; j++) {
			if (!(i == 0 && j == 0) && neighboursCount(collection, row+i, column+j) == 0)
				collection.remove(Cell.deadCell(row+i, column+j));
		}
	}
}
private static int neighboursCount(Set<Cell> collection, int row, int column) {
	int neighbours = 0;
	for (int i = -1; i < 2; i++) {
		for (int j = -1; j < 2; j++) {
			if (!(i == 0 && j == 0) && collection.contains(Cell.livingCell(row+i, column+j)))
				neighbours += 1;
		}
	}
	return neighbours;
}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JHashSet(Blackhole bh) {
		java.util.HashSet<Cell> collection = new java.util.HashSet<>();
		for (Cell cell : startingPoint) addLivingCell(collection, cell.row(), cell.column());
		List<Cell> additions = new ArrayList<>();
		List<Cell> removals = new ArrayList<>();
		while (!collection.isEmpty()) {
		    java.util.Iterator<Cell> iter = collection.iterator();
		    while (iter.hasNext()) {
		        Cell cell = iter.next();
		        int neighbours = neighboursCount(collection, cell.row(), cell.column());
		        if (!cell.isAlive() && neighbours == 3)
		            additions.add(Cell.livingCell(cell.row(), cell.column()));
		        else if (cell.isAlive() && (neighbours < 2 || neighbours > 3))
		            removals.add(Cell.livingCell(cell.row(), cell.column()));
		    }
		    additions.forEach(c -> addLivingCell(collection, c.row(), c.column()));
		    removals.forEach(c -> removeLivingCell(collection, c.row(), c.column()));
		    additions.clear(); removals.clear();
		}
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JLinkedSet(Blackhole bh) {
		java.util.LinkedHashSet<Cell> collection = new java.util.LinkedHashSet<>();
		for (Cell cell : startingPoint) addLivingCell(collection, cell.row(), cell.column());
		List<Cell> additions = new ArrayList<>();
		List<Cell> removals = new ArrayList<>();
		while (!collection.isEmpty()) {
		    java.util.Iterator<Cell> iter = collection.iterator();
		    while (iter.hasNext()) {
		        Cell cell = iter.next();
		        int neighbours = neighboursCount(collection, cell.row(), cell.column());
		        if (!cell.isAlive() && neighbours == 3)
		            additions.add(Cell.livingCell(cell.row(), cell.column()));
		        else if (cell.isAlive() && (neighbours < 2 || neighbours > 3))
		            removals.add(Cell.livingCell(cell.row(), cell.column()));
		    }
		    additions.forEach(c -> addLivingCell(collection, c.row(), c.column()));
		    removals.forEach(c -> removeLivingCell(collection, c.row(), c.column()));
		    additions.clear(); removals.clear();
		}
	}
}

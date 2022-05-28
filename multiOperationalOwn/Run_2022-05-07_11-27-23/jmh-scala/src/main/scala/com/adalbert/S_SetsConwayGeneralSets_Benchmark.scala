package com.adalbert;
import java.util
import scala.collection.immutable
import scala.collection.mutable
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole
import java.util.Objects
import scala.collection.mutable.ArrayBuffer
@State(Scope.Benchmark)
 class S_SetsConwayGeneralSets_Benchmark {
	
object Cell {
	def livingCell(row: Int, column: Int) = new Cell(row, column, true)
	def deadCell(row: Int, column: Int) = new Cell(row, column, false)
}
class Cell private(val row: Int, val column: Int, val isAlive: Boolean) {
	override def equals(o: Any): Boolean = {
	  if (o == null || (getClass ne o.getClass)) return false
	  val cell = o.asInstanceOf[Cell]
	  row == cell.row && column == cell.column && isAlive == cell.isAlive
	}
	override def hashCode: Int = Objects.hash(row, column, isAlive)
}
private val startingPoint = ArrayBuffer(
	Cell.livingCell(0, 0), Cell.livingCell(1, 0), Cell.livingCell(2, 0),
	Cell.livingCell(3, 1),
	Cell.livingCell(1, 2), Cell.livingCell(2, 2),
	Cell.livingCell(3, 3),
	Cell.livingCell(0, 4), Cell.livingCell(1, 4), Cell.livingCell(2, 4)
)
private def addLivingCell(collection: mutable.Set[Cell], row: Int, column: Int): Unit = {
	collection.remove(Cell.deadCell(row, column))
	collection.add(Cell.livingCell(row, column))
	for (i <- -1 until 2)
	  for (j <- -1 until 2)
		if (!(i == 0 && j == 0) && !collection.contains(Cell.livingCell(row + i, column + j)))
		  collection.add(Cell.deadCell(row + i, column + j))
}
private def removeLivingCell(collection: mutable.Set[Cell], row: Int, column: Int): Unit = {
	collection.remove(Cell.livingCell(row, column))
	if (neighboursCount(collection, row, column) != 0) collection.add(Cell.deadCell(row, column))
	for (i <- -1 until 2)
	  for (j <- -1 until 2)
		if (!(i == 0 && j == 0) && neighboursCount(collection, row + i, column + j) == 0)
		  collection.remove(Cell.deadCell(row + i, column + j))
}
private def neighboursCount(collection: mutable.Set[Cell], row: Int, column: Int): Int = {
	var neighbours = 0
	for (i <- -1 until 2)
	  for (j <- -1 until 2)
		if (!(i == 0 && j == 0) && collection.contains(Cell.livingCell(row + i, column + j)))
		  neighbours += 1
	neighbours
}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SHashSet(bh: Blackhole): Unit = {
		var collection = mutable.HashSet[Cell]()
		for (cell <- startingPoint) addLivingCell(collection, cell.row, cell.column)
		val additions = new util.ArrayList[Cell]
		val removals = new util.ArrayList[Cell]
		while (collection.nonEmpty) {
		  val iter = collection.iterator
		  while (iter.hasNext) {
		    val cell = iter.next
		    val neighbours: Int = neighboursCount(collection, cell.row, cell.column)
		    if (!cell.isAlive && neighbours == 3) additions.add(Cell.livingCell(cell.row, cell.column))
		    else if (cell.isAlive && (neighbours < 2 || neighbours > 3)) removals.add(Cell.livingCell(cell.row, cell.column))
		  }
		  additions.forEach((c: Cell) => addLivingCell(collection, c.row, c.column))
		  removals.forEach((c: Cell) => removeLivingCell(collection, c.row, c.column))
		  additions.clear()
		  removals.clear()
		}
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SLinkedSet(bh: Blackhole): Unit = {
		var collection = mutable.LinkedHashSet[Cell]()
		for (cell <- startingPoint) addLivingCell(collection, cell.row, cell.column)
		val additions = new util.ArrayList[Cell]
		val removals = new util.ArrayList[Cell]
		while (collection.nonEmpty) {
		  val iter = collection.iterator
		  while (iter.hasNext) {
		    val cell = iter.next
		    val neighbours: Int = neighboursCount(collection, cell.row, cell.column)
		    if (!cell.isAlive && neighbours == 3) additions.add(Cell.livingCell(cell.row, cell.column))
		    else if (cell.isAlive && (neighbours < 2 || neighbours > 3)) removals.add(Cell.livingCell(cell.row, cell.column))
		  }
		  additions.forEach((c: Cell) => addLivingCell(collection, c.row, c.column))
		  removals.forEach((c: Cell) => removeLivingCell(collection, c.row, c.column))
		  additions.clear()
		  removals.clear()
		}
	}
}

package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
@State(Scope.Benchmark)
public  class J_SetsOpsSortedSets_Benchmark {
	private HashSet<Integer> firstSet;
	private HashSet<Integer> secondSet;
	private HashSet<Integer> thirdSet;
	@Setup
	public void prepareSets() {
		firstSet = new HashSet<>();
		secondSet = new HashSet<>();
		thirdSet = new HashSet<>();
		for (int i = 0; i < 10000; i++) {
			if (i % 3 == 0) firstSet.add(i);
			if (i % 5 == 0) secondSet.add(i);
			if (i % 7 == 0) thirdSet.add(i);
		}
	}

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JTreeSet(Blackhole bh) {
		java.util.TreeSet<Integer> collection = new java.util.TreeSet<>();
		collection.addAll(firstSet);
		collection.addAll(secondSet);
		collection.addAll(thirdSet);
		collection.retainAll(firstSet);
		collection.removeAll(secondSet);
		collection.retainAll(thirdSet);
		bh.consume(collection.size());
		collection.clear();
	}
}

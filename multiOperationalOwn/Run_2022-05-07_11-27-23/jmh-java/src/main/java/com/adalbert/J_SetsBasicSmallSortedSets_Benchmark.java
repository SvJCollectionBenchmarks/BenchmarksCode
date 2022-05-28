package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
@State(Scope.Benchmark)
public  class J_SetsBasicSmallSortedSets_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JTreeSet(Blackhole bh) {
		java.util.TreeSet<Integer> collection = new java.util.TreeSet<>();
		for (int i = 0; i < 1000; i++)
		    collection.add(i);
		for (int i = 0; i < 10000; i++) {
		    int value = (i % 4 == 0 ? -i : i) % 1000;
		    switch (i % 5) {
		        case 0: collection.add(value); break;
		        case 1: collection.remove(value); break;
		        case 2: bh.consume(collection.contains(value)); break;
		        case 3: collection.addAll(Arrays.asList(value - 1, value, value + 1));
		        case 4: collection.removeAll(Arrays.asList(value - 1, value, value + 1));
		    }
		}
		collection.clear();
	}
}

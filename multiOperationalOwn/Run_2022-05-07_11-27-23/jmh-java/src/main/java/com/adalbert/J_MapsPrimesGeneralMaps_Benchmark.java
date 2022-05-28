package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
@State(Scope.Benchmark)
public  class J_MapsPrimesGeneralMaps_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JHashMap(Blackhole bh) {
		java.util.HashMap<Integer, java.util.List<Integer>> collection = new java.util.HashMap<>();
		for (int i = 2; i < 1000; i++) {
		    boolean wasFound = false;
		    java.util.Iterator<Integer> iterator = collection.keySet().iterator();
		    while (iterator.hasNext() && !wasFound) {
		        Integer key = iterator.next();
		        wasFound = i % key == 0;
		        if (wasFound) collection.get(key).add(i);
		    }
		    if (!wasFound) collection.put(i, new ArrayList<Integer>());
		}
		bh.consume(collection.keySet());
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JLinkedMap(Blackhole bh) {
		java.util.LinkedHashMap<Integer, java.util.List<Integer>> collection = new java.util.LinkedHashMap<>();
		for (int i = 2; i < 1000; i++) {
		    boolean wasFound = false;
		    java.util.Iterator<Integer> iterator = collection.keySet().iterator();
		    while (iterator.hasNext() && !wasFound) {
		        Integer key = iterator.next();
		        wasFound = i % key == 0;
		        if (wasFound) collection.get(key).add(i);
		    }
		    if (!wasFound) collection.put(i, new ArrayList<Integer>());
		}
		bh.consume(collection.keySet());
	}
}

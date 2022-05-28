package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
@State(Scope.Benchmark)
public  class J_SetsBasicBigGeneralSets_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JHashSet(Blackhole bh) {
		java.util.HashSet<Integer> collection = new java.util.HashSet<>();
		for (int i = 0; i < 20000; i++)
		    collection.add(i);
		for (int i = 0; i < 1000; i++) {
		    int value = i % 3 == 0 ? -i : i;
		    switch (i % 4) {
		        case 0:
		        case 1: collection.add(value); break;
		        case 2: bh.consume(collection.remove(value)); break;
		        case 3: bh.consume(collection.contains(value)); break;
		    }
		}
		collection.clear();
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JLinkedSet(Blackhole bh) {
		java.util.LinkedHashSet<Integer> collection = new java.util.LinkedHashSet<>();
		for (int i = 0; i < 20000; i++)
		    collection.add(i);
		for (int i = 0; i < 1000; i++) {
		    int value = i % 3 == 0 ? -i : i;
		    switch (i % 4) {
		        case 0:
		        case 1: collection.add(value); break;
		        case 2: bh.consume(collection.remove(value)); break;
		        case 3: bh.consume(collection.contains(value)); break;
		    }
		}
		collection.clear();
	}
}

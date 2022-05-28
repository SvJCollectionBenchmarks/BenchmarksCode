package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
@State(Scope.Benchmark)
public  class J_MapsEditSortedMaps_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JTreeMap(Blackhole bh) {
		java.util.TreeMap<Integer, Integer> collection = new java.util.TreeMap<>();
		for (int i = 0; i < 5000; i++)
		    collection.put(i, i);
		for (int i = 0; i < 5000; i++) {
		    int value = i % 3 == 0 ? -i : i;
		    if (collection.containsKey(value))
		        switch (i % 2) {
		            case 0: collection.replace(value, -value);
		            case 1: collection.remove(value);
		        }
		    else collection.put(value, value);
		}
	}
}

package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
@State(Scope.Benchmark)
public  class J_MapsBookIndexSortedMaps_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JTreeMap(Blackhole bh) {
		java.util.TreeMap<Long, String> collection = new java.util.TreeMap<>();
		for (int i = 0; i < 100; i++) {
		    Long key = (long)(Math.sqrt(i) * Math.sin(i) * 10000);
		    collection.put(key, String.format("Book %d", i));
		}
		for (long i = 0; i < 10000; i++) {
		    bh.consume(i);
		    if (i % 100 == 0) bh.consume(collection.keySet());
		    if (i % 2 == 0) bh.consume(collection.get(i));
		    else bh.consume(collection.get(-i));
		}
	}
}

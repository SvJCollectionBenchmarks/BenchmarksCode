package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
@State(Scope.Benchmark)
public  class J_MapsCreateReadGeneralMaps_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=10, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JHashMap(Blackhole bh) {
		java.util.HashMap<String, String> collection = new java.util.HashMap<>();
		for (int i = 0; i < 1000; i++)
		    collection.put(String.format("Key %d", i), String.format("Value %d", i));
		for (int i = 0; i < 1000; i++) {
		    int value = i % 3 == 0 ? -i : i;
		    String mapKey = String.format("Key %d", value);
		    if (collection.containsKey(mapKey)) bh.consume(collection.get(mapKey));
		}
		bh.consume(collection.size());
		bh.consume(collection.keySet());
		bh.consume(collection.values());
		collection.clear();
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=10, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JLinkedMap(Blackhole bh) {
		java.util.LinkedHashMap<String, String> collection = new java.util.LinkedHashMap<>();
		for (int i = 0; i < 1000; i++)
		    collection.put(String.format("Key %d", i), String.format("Value %d", i));
		for (int i = 0; i < 1000; i++) {
		    int value = i % 3 == 0 ? -i : i;
		    String mapKey = String.format("Key %d", value);
		    if (collection.containsKey(mapKey)) bh.consume(collection.get(mapKey));
		}
		bh.consume(collection.size());
		bh.consume(collection.keySet());
		bh.consume(collection.values());
		collection.clear();
	}
}

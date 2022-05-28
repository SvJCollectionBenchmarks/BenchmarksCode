package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
@State(Scope.Benchmark)
public  class J_SeqsLookupAllSequences_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JArraySequence(Blackhole bh) {
		java.util.ArrayList<Integer> collection = new java.util.ArrayList<>();
		for (int i = 0; i < 1000; i++)
		    collection.add(i);
		for (int i = 0; i < 1000; i++) {
		    int index = (i * 1000 / 3) % collection.size();
		    bh.consume(collection.get(index));
		    int value = i % 3 == 0 ? -index : index;
		    switch (i % 3) {
		        case 0: bh.consume(collection.indexOf(value)); break;
		        case 1: bh.consume(collection.lastIndexOf(value)); break;
		        case 2: bh.consume(collection.contains(value)); break;
		    }
		}
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JLinkedSequence(Blackhole bh) {
		java.util.LinkedList<Integer> collection = new java.util.LinkedList<>();
		for (int i = 0; i < 1000; i++)
		    collection.addLast(i);
		for (int i = 0; i < 1000; i++) {
		    int index = (i * 1000 / 3) % collection.size();
		    bh.consume(collection.get(index));
		    int value = i % 3 == 0 ? -index : index;
		    switch (i % 3) {
		        case 0: bh.consume(collection.indexOf(value)); break;
		        case 1: bh.consume(collection.lastIndexOf(value)); break;
		        case 2: bh.consume(collection.contains(value)); break;
		    }
		}
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JVectorSequence(Blackhole bh) {
		java.util.Vector<Integer> collection = new java.util.Vector<>();
		for (int i = 0; i < 1000; i++)
		    collection.add(i);
		for (int i = 0; i < 1000; i++) {
		    int index = (i * 1000 / 3) % collection.size();
		    bh.consume(collection.get(index));
		    int value = i % 3 == 0 ? -index : index;
		    switch (i % 3) {
		        case 0: bh.consume(collection.indexOf(value)); break;
		        case 1: bh.consume(collection.lastIndexOf(value)); break;
		        case 2: bh.consume(collection.contains(value)); break;
		    }
		}
	}
}

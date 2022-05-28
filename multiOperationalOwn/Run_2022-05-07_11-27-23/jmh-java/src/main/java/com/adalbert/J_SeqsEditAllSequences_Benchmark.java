package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
@State(Scope.Benchmark)
public  class J_SeqsEditAllSequences_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JArraySequence(Blackhole bh) {
		java.util.ArrayList<Double> collection = new java.util.ArrayList<>();
		for (int i = 0; i < 1000; i++)
		    collection.add(Math.sin(i/0.01));
		List<Double> samples = Arrays.asList(1.0, 0.0, -1.0, 0.0, 1.0, 0.0, -1.0, 0.0);
		for (int i = 0; i < 1000; i++) {
		    int index = (i * 1000 / 3) % collection.size();
		    switch (i % 4) {
		        case 0: collection.set(index, 1.0); break;
		        case 1: collection.add(index, 1.0); break;
		        case 2: collection.remove(index); break;
		        case 3: collection.addAll(index, samples); break;
		    }
		}
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JLinkedSequence(Blackhole bh) {
		java.util.LinkedList<Double> collection = new java.util.LinkedList<>();
		for (int i = 0; i < 1000; i++)
		    collection.addLast(Math.sin(i/0.01));
		List<Double> samples = Arrays.asList(1.0, 0.0, -1.0, 0.0, 1.0, 0.0, -1.0, 0.0);
		for (int i = 0; i < 1000; i++) {
		    int index = (i * 1000 / 3) % collection.size();
		    switch (i % 4) {
		        case 0: collection.set(index, 1.0); break;
		        case 1: collection.add(index, 1.0); break;
		        case 2: collection.remove(index); break;
		        case 3: collection.addAll(index, samples); break;
		    }
		}
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JVectorSequence(Blackhole bh) {
		java.util.Vector<Double> collection = new java.util.Vector<>();
		for (int i = 0; i < 1000; i++)
		    collection.add(Math.sin(i/0.01));
		List<Double> samples = Arrays.asList(1.0, 0.0, -1.0, 0.0, 1.0, 0.0, -1.0, 0.0);
		for (int i = 0; i < 1000; i++) {
		    int index = (i * 1000 / 3) % collection.size();
		    switch (i % 4) {
		        case 0: collection.set(index, 1.0); break;
		        case 1: collection.add(index, 1.0); break;
		        case 2: collection.remove(index); break;
		        case 3: collection.addAll(index, samples); break;
		    }
		}
	}
}

package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
@State(Scope.Benchmark)
public  class J_SeqsAudioIndexedSequences_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JArraySequence(Blackhole bh) {
		java.util.ArrayList<Double> collection = new java.util.ArrayList<>();
		List<Double> samples = Arrays.asList(1.0, 0.75, 0.5, 0.25, 0.0);
		for (int i = 0; i < 10000 / samples.size(); i++) {
		    bh.consume(i);
		    collection.addAll(samples);
		}
		for (int i = 0; i < collection.size(); i++) {
		    bh.consume(i);
		    Double elem = collection.get(i);
		    collection.set(i, elem * 0.5);
		}
		List<Double> zero = Arrays.asList(0.0);
		collection.removeAll(zero);
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JVectorSequence(Blackhole bh) {
		java.util.Vector<Double> collection = new java.util.Vector<>();
		List<Double> samples = Arrays.asList(1.0, 0.75, 0.5, 0.25, 0.0);
		for (int i = 0; i < 10000 / samples.size(); i++) {
		    bh.consume(i);
		    collection.addAll(samples);
		}
		for (int i = 0; i < collection.size(); i++) {
		    bh.consume(i);
		    Double elem = collection.get(i);
		    collection.set(i, elem * 0.5);
		}
		List<Double> zero = Arrays.asList(0.0);
		collection.removeAll(zero);
	}
}

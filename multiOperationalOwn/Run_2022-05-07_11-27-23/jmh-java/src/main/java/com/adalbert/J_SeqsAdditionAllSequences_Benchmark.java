package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
@State(Scope.Benchmark)
public  class J_SeqsAdditionAllSequences_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JArraySequence(Blackhole bh) {
		java.util.ArrayList<Double> collection = new java.util.ArrayList<>();
		for (int i = 0; i < 5000; i++) {
		    if (i % 2 == 0) collection.add(Math.sin(i/0.01));
		    else collection.add(0, Math.sin(i/0.01));
		}
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JLinkedSequence(Blackhole bh) {
		java.util.LinkedList<Double> collection = new java.util.LinkedList<>();
		for (int i = 0; i < 5000; i++) {
		    if (i % 2 == 0) collection.addLast(Math.sin(i/0.01));
		    else collection.addFirst(Math.sin(i/0.01));
		}
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JVectorSequence(Blackhole bh) {
		java.util.Vector<Double> collection = new java.util.Vector<>();
		for (int i = 0; i < 5000; i++) {
		    if (i % 2 == 0) collection.add(Math.sin(i/0.01));
		    else collection.add(0, Math.sin(i/0.01));
		}
	}
}

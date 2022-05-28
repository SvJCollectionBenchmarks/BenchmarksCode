package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
@State(Scope.Benchmark)
public  class J_SeqsMessagesLinkedSequences_Benchmark {
	class Message {
		long id;
		String message;
		public Message(long id, String message) {
			this.id = id;
			this.message = message;
		}
	}

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JLinkedSequence(Blackhole bh) {
		java.util.LinkedList<Message> collection = new java.util.LinkedList<>();
		for (int i = 0; i < 10000; i++) {
		    double value = Math.sin(i) * (i % 5);
		    if (value > -0.25) collection.addLast(new Message(i, "Message text"));
		    if (i % 3 == 0 && !collection.isEmpty()) collection.remove(0);
		
		    int halfSize = collection.size() / 2;
		    if (value < -3.5 && !collection.isEmpty()) collection.set(halfSize, new Message(halfSize, "Another message text"));
		    if (value < -2.5 && !collection.isEmpty()) collection.remove(halfSize);
		}
	}
}

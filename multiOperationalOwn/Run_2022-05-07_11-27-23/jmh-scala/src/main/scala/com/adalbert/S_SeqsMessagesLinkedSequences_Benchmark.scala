package com.adalbert;
import java.util
import scala.collection.immutable
import scala.collection.mutable
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole
import java.util.Objects
import scala.collection.mutable.ArrayBuffer
@State(Scope.Benchmark)
 class S_SeqsMessagesLinkedSequences_Benchmark {
	class Message(var id: Long, var message: String)

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SLinkedSequence(bh: Blackhole): Unit = {
		var collection = mutable.ListBuffer[Message]()
		for (i <- 0 until 10000) {
		    val value = Math.sin(i) * (i % 5)
		    if (value > -0.25) collection.append(new Message(i, "Message text"))
		    if (i % 3 == 0 && !collection.isEmpty) collection.remove(0)
		
		    val halfSize = collection.size / 2
		    if (value < -3.5 && !collection.isEmpty) collection.update(halfSize, new Message(halfSize, "Another message text"))
		    if (value < -2.5 && !collection.isEmpty) collection.remove(halfSize)
		}
	}
}

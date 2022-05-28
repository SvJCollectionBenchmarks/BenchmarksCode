package com.adalbert;
import java.util
import scala.collection.immutable
import scala.collection.mutable
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole
@State(Scope.Benchmark)
 class S_SeqsAdditionAllSequences_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SArraySequence(bh: Blackhole): Unit = {
		var collection = mutable.ArrayBuffer[Double]()
		for (i <- 0 until 5000)
		    if (i % 2 == 0) collection.append(Math.sin(i/0.01))
		    else collection.prepend(Math.sin(i/0.01))
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SLinkedSequence(bh: Blackhole): Unit = {
		var collection = mutable.ListBuffer[Double]()
		for (i <- 0 until 5000)
		    if (i % 2 == 0) collection.append(Math.sin(i/0.01))
		    else collection.prepend(Math.sin(i/0.01))
	}
}

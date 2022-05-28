package com.adalbert;
import java.util
import scala.collection.immutable
import scala.collection.mutable
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole
@State(Scope.Benchmark)
 class S_SeqsEditAllSequences_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SArraySequence(bh: Blackhole): Unit = {
		var collection = mutable.ArrayBuffer[Double]()
		for (i <- 0 until 1000)
		    collection.append(Math.sin(i/0.01))
		val samples = mutable.ArrayBuffer(1.0, 0.0, -1.0, 0.0, 1.0, 0.0, -1.0, 0.0)
		for (i <- 0 until 1000) {
		    val index = (i * 1000 / 3) % collection.size;
		    (i % 4) match {
		        case 0 => collection.update(index, 1.0)
		        case 1 => collection.insert(index, 1.0)
		        case 2 => collection.remove(index)
		        case 3 => collection.insertAll(index, samples)
		    }
		}
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SLinkedSequence(bh: Blackhole): Unit = {
		var collection = mutable.ListBuffer[Double]()
		for (i <- 0 until 1000)
		    collection.append(Math.sin(i/0.01))
		val samples = mutable.ArrayBuffer(1.0, 0.0, -1.0, 0.0, 1.0, 0.0, -1.0, 0.0)
		for (i <- 0 until 1000) {
		    val index = (i * 1000 / 3) % collection.size;
		    (i % 4) match {
		        case 0 => collection.update(index, 1.0)
		        case 1 => collection.insert(index, 1.0)
		        case 2 => collection.remove(index)
		        case 3 => collection.insertAll(index, samples)
		    }
		}
	}
}

package com.adalbert;
import java.util
import scala.collection.immutable
import scala.collection.mutable
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole
@State(Scope.Benchmark)
 class S_SeqsLookupAllSequences_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SArraySequence(bh: Blackhole): Unit = {
		var collection = mutable.ArrayBuffer[Integer]()
		for (i <- 0 until 1000)
		    collection.append(i)
		for (i <- 0 until 1000) {
		    val index = (i * 1000 / 3) % collection.size;
		    bh.consume(collection.apply(index))
		    val value = if (i % 3 == 0) -index else index
		    (i % 3) match {
		        case 0 => bh.consume(collection.indexOf(value))
		        case 1 => bh.consume(collection.lastIndexOf(value, collection.size - 1))
		        case 2 => bh.consume(collection.contains(value))
		    }
		}
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SLinkedSequence(bh: Blackhole): Unit = {
		var collection = mutable.ListBuffer[Integer]()
		for (i <- 0 until 1000)
		    collection.append(i)
		for (i <- 0 until 1000) {
		    val index = (i * 1000 / 3) % collection.size;
		    bh.consume(collection.apply(index))
		    val value = if (i % 3 == 0) -index else index
		    (i % 3) match {
		        case 0 => bh.consume(collection.indexOf(value))
		        case 1 => bh.consume(collection.lastIndexOf(value, collection.size - 1))
		        case 2 => bh.consume(collection.contains(value))
		    }
		}
	}
}

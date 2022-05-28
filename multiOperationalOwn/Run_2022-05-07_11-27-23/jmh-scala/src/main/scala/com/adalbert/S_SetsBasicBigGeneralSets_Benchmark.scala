package com.adalbert;
import java.util
import scala.collection.immutable
import scala.collection.mutable
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole
@State(Scope.Benchmark)
 class S_SetsBasicBigGeneralSets_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SHashSet(bh: Blackhole): Unit = {
		var collection = mutable.HashSet[Integer]();
		for (i <- 0 until 20000)
		    collection.add(i);
		for (i <- 0 until 1000) {
		  val value: Int = if (i % 3 == 0) -i else i
		  i % 4 match {
		    case 0 | 1 => collection.add(value)
		    case 2 => bh.consume(collection.remove(value))
		    case 3 => bh.consume(collection.contains(value))
		  }
		}
		collection.clear()
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SLinkedSet(bh: Blackhole): Unit = {
		var collection = mutable.LinkedHashSet[Integer]();
		for (i <- 0 until 20000)
		    collection.add(i);
		for (i <- 0 until 1000) {
		  val value: Int = if (i % 3 == 0) -i else i
		  i % 4 match {
		    case 0 | 1 => collection.add(value)
		    case 2 => bh.consume(collection.remove(value))
		    case 3 => bh.consume(collection.contains(value))
		  }
		}
		collection.clear()
	}
}

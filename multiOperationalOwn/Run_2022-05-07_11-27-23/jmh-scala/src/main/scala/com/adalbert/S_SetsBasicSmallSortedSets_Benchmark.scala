package com.adalbert;
import java.util
import scala.collection.immutable
import scala.collection.mutable
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole
@State(Scope.Benchmark)
 class S_SetsBasicSmallSortedSets_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def STreeSet(bh: Blackhole): Unit = {
		val collection: mutable.HashSet[Integer] = new mutable.HashSet[Integer]
		for (i <- 0 until 1000)
		    collection.add(i);
		for (i <- 0 until 10000) {
		  val value: Int = (if (i % 4 == 0) -i else i) % 1000
		  i % 5 match {
		    case 0 => collection.add(value)
		    case 1 => collection.remove(value)
		    case 2 => bh.consume(collection.contains(value))
		    case 3 => collection.addAll(Vector(value - 1, value, value + 1))
		    case 4 => collection.subtractAll(Vector(value - 1, value, value + 1))
		  }
		}
		collection.clear()
	}
}

package com.adalbert;
import java.util
import scala.collection.immutable
import scala.collection.mutable
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole
@State(Scope.Benchmark)
 class S_MapsEditGeneralMaps_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SHashMap(bh: Blackhole): Unit = {
		var collection = mutable.HashMap[Integer, Integer]()
		for (i <- 0 until 5000)
		    collection.update(i, i)
		for (i <- 0 until 5000) {
		    val value = if (i % 3 == 0) -i else i
		    if (collection.contains(value)) i % 2 match {
		       case 0 => collection.update(value, -value)
		       case 1 => collection.remove(value)
		    }
		    else collection.update(value, value)
		}
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SLinkedMap(bh: Blackhole): Unit = {
		var collection = mutable.LinkedHashMap[Integer, Integer]()
		for (i <- 0 until 5000)
		    collection.update(i, i)
		for (i <- 0 until 5000) {
		    val value = if (i % 3 == 0) -i else i
		    if (collection.contains(value)) i % 2 match {
		       case 0 => collection.update(value, -value)
		       case 1 => collection.remove(value)
		    }
		    else collection.update(value, value)
		}
	}
}

package com.adalbert;
import java.util
import scala.collection.immutable
import scala.collection.mutable
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole
@State(Scope.Benchmark)
 class S_MapsPrimesGeneralMaps_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SHashMap(bh: Blackhole): Unit = {
		var collection = mutable.HashMap[Integer, util.List[Integer]]()
		for (i <- 2 until 1000) {
		    var wasFound = false
		    val iterator = collection.keySet.iterator
		    while (iterator.hasNext && !wasFound) {
		        val key = iterator.next()
		        wasFound = i % key == 0
		        if (wasFound) collection.getOrElse(key, null).add(i)
		    }
		    if (!wasFound)
		        collection.update(i, new util.ArrayList[Integer]())
		}
		bh.consume(collection.keySet)
	}
	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SLinkedMap(bh: Blackhole): Unit = {
		var collection = mutable.LinkedHashMap[Integer, util.List[Integer]]()
		for (i <- 2 until 1000) {
		    var wasFound = false
		    val iterator = collection.keySet.iterator
		    while (iterator.hasNext && !wasFound) {
		        val key = iterator.next()
		        wasFound = i % key == 0
		        if (wasFound) collection.getOrElse(key, null).add(i)
		    }
		    if (!wasFound)
		        collection.update(i, new util.ArrayList[Integer]())
		}
		bh.consume(collection.keySet)
	}
}

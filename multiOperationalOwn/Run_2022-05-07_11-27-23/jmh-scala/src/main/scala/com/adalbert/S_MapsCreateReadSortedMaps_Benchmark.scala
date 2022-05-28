package com.adalbert;
import java.util
import scala.collection.immutable
import scala.collection.mutable
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole
@State(Scope.Benchmark)
 class S_MapsCreateReadSortedMaps_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=10, iterations=10)
	@Measurement(time=5, iterations=30)
	def STreeMap(bh: Blackhole): Unit = {
		var collection = mutable.TreeMap[String, String]()
		for (i <- 0 until 1000)
		    collection.update(String.format("Key %d", i), String.format("Value %d", i))
		for (i <- 0 until 1000) {
		    val value = if (i % 3 == 0) -i else i
		    val mapKey = String.format("Key %d", value)
		    if (collection.contains(mapKey)) bh.consume(collection.getOrElse(mapKey, null));
		}
		bh.consume(collection.size)
		bh.consume(collection.keySet)
		bh.consume(collection.values)
		collection.clear()
	}
}

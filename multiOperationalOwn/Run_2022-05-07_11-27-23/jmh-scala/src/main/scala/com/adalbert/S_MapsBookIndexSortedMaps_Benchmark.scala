package com.adalbert;
import java.util
import scala.collection.immutable
import scala.collection.mutable
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole
@State(Scope.Benchmark)
 class S_MapsBookIndexSortedMaps_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def STreeMap(bh: Blackhole): Unit = {
		var collection = mutable.TreeMap[Long, String]();
		for (i <- 0 until 100) {
		    val key = (Math.sqrt(i) * Math.sin(i) * 10000).longValue()
		    collection.update(key, String.format("Book %d", i))
		}
		for ( i <- 0 until 10000) {
		    bh.consume(i);
		    if (i % 100 == 0) bh.consume(collection.keySet)
		    if (i % 2 == 0) bh.consume(collection.getOrElse(i, null))
		    else bh.consume(collection.getOrElse(-i, null))
		}
	}
}

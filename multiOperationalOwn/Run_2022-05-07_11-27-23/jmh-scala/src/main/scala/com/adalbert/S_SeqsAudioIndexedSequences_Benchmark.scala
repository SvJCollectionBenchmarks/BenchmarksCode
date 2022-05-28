package com.adalbert;
import java.util
import scala.collection.immutable
import scala.collection.mutable
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole
@State(Scope.Benchmark)
 class S_SeqsAudioIndexedSequences_Benchmark {
	

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def SArraySequence(bh: Blackhole): Unit = {
		var collection = mutable.ArrayBuffer[Double]()
		val samples = mutable.ArrayBuffer(1.0, 0.75, 0.5, 0.25, 0.0)
		for (i <- 0 until 10000 / samples.size) {
		    bh.consume(i);
		    collection.addAll(samples)
		}
		for (i <- collection.indices) {
		    bh.consume(i);
		    val elem = collection.apply(i)
		    collection.update(i, elem * 0.5)
		}
		val zero = mutable.ArrayBuffer(0.0)
		collection.filterInPlace(!zero.contains(_))
	}
}

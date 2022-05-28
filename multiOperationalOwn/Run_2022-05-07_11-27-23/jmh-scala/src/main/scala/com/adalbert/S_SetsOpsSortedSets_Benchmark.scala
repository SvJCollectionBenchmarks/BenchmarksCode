package com.adalbert;
import java.util
import scala.collection.immutable
import scala.collection.mutable
import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole
@State(Scope.Benchmark)
 class S_SetsOpsSortedSets_Benchmark {
	private var firstSet: mutable.HashSet[Integer] = null
	private var secondSet: mutable.HashSet[Integer] = null
	private var thirdSet: mutable.HashSet[Integer] = null
	@Setup def prepareSets(): Unit = {
		firstSet = new mutable.HashSet[Integer]
		secondSet = new mutable.HashSet[Integer]
		thirdSet = new mutable.HashSet[Integer]
		for (i <- 0 until 10000) {
			if (i % 3 == 0) firstSet.add(i)
			if (i % 5 == 0) secondSet.add(i)
			if (i % 7 == 0) thirdSet.add(i)
		}
	}

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	def STreeSet(bh: Blackhole): Unit = {
		var collection = mutable.TreeSet[Integer]()
		collection = collection.union(firstSet)
		collection = collection.union(secondSet)
		collection = collection.union(thirdSet)
		collection = collection.intersect(firstSet)
		collection = collection.diff(secondSet)
		collection = collection.intersect(thirdSet)
		bh.consume(collection.size)
		collection.clear()
	}
}

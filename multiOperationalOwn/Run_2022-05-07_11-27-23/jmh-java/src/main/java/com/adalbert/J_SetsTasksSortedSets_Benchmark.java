package com.adalbert;
import java.util.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
@State(Scope.Benchmark)
public  class J_SetsTasksSortedSets_Benchmark {
	static class Task implements Comparable<Task> {
		private final double priority;
		private final int time;
		public Task(double priority, int time) {
			this.priority = priority;
			this.time = time;
		}
		public int getTime() { return time; }
		@Override
		public int compareTo(Task o) {
			return -(int)((this.priority - o.priority)*1000000);
		}
		@Override
		public boolean equals(Object o) {
			if (o == null || getClass() != o.getClass()) return false;
			Task task = (Task) o;
			return priority == task.priority && time == task.time;
		}
		@Override
		public int hashCode() {
			return Objects.hash(priority, time);
		}
	}

	@Benchmark
	@Fork(1)
	@Warmup(time=5, iterations=10)
	@Measurement(time=5, iterations=30)
	public void JTreeSet(Blackhole bh) {
		java.util.TreeSet<Task> collection = new java.util.TreeSet<>();
		int calcPower = 0;
		Task currentTask = null;
		for (int i = 0; i < 1000; i++) {
		
		    double priority = i % 2 == 0 ? 1000 * Math.sin(i) : 1000 * Math.cos(i);
		    int time =  i % 2 == 0 ? i%3 + i%4 + i%5 : i%4 + i%6 + i%7;
		    collection.add(new Task(priority, time));
		
		    if (currentTask == null)
		        currentTask = collection.iterator().next();
		    if (currentTask.getTime() <= calcPower) {
		        calcPower -= currentTask.getTime();
		        collection.add(currentTask);
		        currentTask = null;
		    }
		
		    calcPower += 5;
		}
	}
}

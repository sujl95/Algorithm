package Algorism.Java.programmers.level2.stackqueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class P42583_bridge {
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7, 4, 5, 6};
		System.out.println(solution(bridge_length,weight,truck_weights));
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int bridgeWeight = weight;
		Truck truck = null;
		LinkedList<Truck> truckQueue = new LinkedList<>();
		LinkedList<Truck> loadedTruck = new LinkedList<>();
		for (int truckWeight : truck_weights) {
			truckQueue.add(new Truck(truckWeight, bridge_length));
		}
		while (!(truckQueue.isEmpty() && loadedTruck.isEmpty())) {
			answer++;
			if (!loadedTruck.isEmpty() && loadedTruck.peek().length == 0) {
				bridgeWeight += loadedTruck.peek().weight;
				loadedTruck.poll();
			}
			if (!truckQueue.isEmpty() && bridgeWeight - truckQueue.peek().weight >= 0) {
				bridgeWeight -= truckQueue.peek().weight;
				loadedTruck.add(truckQueue.poll());
			}
			Iterator iterator = loadedTruck.iterator();
			while(iterator.hasNext()) {
				truck = (Truck)iterator.next();
				truck.length--;
			}
		}

		return answer;
	}
}


class Truck {
	int weight;
	int length;

	public Truck(int weight, int length) {
		this.weight = weight;
		this.length = length;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}

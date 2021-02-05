package Algorism.Java.programmers.level2.kakao;

import java.util.Arrays;
import java.util.LinkedList;

public class P17680_2018_Cache {

	static final int cacheHit = 1;
	static final int cacheMiss = 5;

	public static void main(String[] args) {
		int cacheSize = 4;
		// String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		// String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
		// String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		// String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		// String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};
		// String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		// String[] cities = {"SEOUL", "SEOUL", "SEOUL"};
		String[] cities = {"1", "2", "3", "4", "2"};

		System.out.println("solution() = " + solution(cacheSize, cities));
	}
	
	public static int solution(int cacheSize, String[] cities) {
		if (cacheSize == 0) {
			return cities.length * cacheMiss;
		}
		int answer = 0;
		LinkedList<String> linkedList = new LinkedList<>();
		for (String city : cities) {
			city = city.toLowerCase();
			if (linkedList.remove(city)) {
				linkedList.addFirst(city);
				answer += cacheHit;
			} else {
				if (linkedList.size() == cacheSize) {
					linkedList.pollLast();
				}
				linkedList.addFirst(city);
				answer += cacheMiss;
			}
		}
		return answer;
	}
}

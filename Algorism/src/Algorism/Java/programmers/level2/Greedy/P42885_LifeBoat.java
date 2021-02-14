package Algorism.Java.programmers.level2.Greedy;

import java.util.Arrays;

public class P42885_LifeBoat {

	public static void main(String[] args) {
		// int[] people = {70, 50, 80, 50};
		int[] people = {40, 50, 60, 100, 200, 200, 240};
		System.out.println("solution() = " + solution(people, 240));
	}

	public static int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);
		int pos = people.length-1;
		for (int i = 0; i <= pos; i++) {
			answer++;
			while (i < pos && limit < people[i] + people[pos--]) {
				answer++;
			}
		}
		return answer;
	}
}

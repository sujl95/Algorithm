package Algorithm.Java.programmers.level2.DfsBfs;

import java.util.Arrays;

public class P43165_TargetNumber2 {
	static int answer = 0;
	
	
	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 1;
		System.out.println("solution() = " + solution(numbers,target));
	}
	
	public static int solution(int[] numbers, int target) {
		
		if (Arrays.stream(numbers).sum() < target) return 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] *= -1;
			dfs(numbers, target, i);
			numbers[i] *= -1;
		}
		return answer;
	}

	private static void dfs(int[] numbers, int target, int idx) {
		int sum = Arrays.stream(numbers).sum();
		if (sum == target) answer++;
		else if (sum >= target) {
			for (int i = idx+1; i < numbers.length; i++) {
				numbers[i] *= -1;
				dfs(numbers, target, i);
				numbers[i] *= -1;
			}
		}
	}
}

package Algorithm.Java.programmers.level2.BruteForce;

import java.util.ArrayList;
import java.util.Arrays;

public class P42839_PrimeNumberFind {

	static ArrayList<Integer> list;
	static boolean[] visited;

	public static void main(String[] args) {
		System.out.println("solution(\"17\") = " + solution("17"));
	}
	
	public static int solution(String numbers) {
		list = new ArrayList<>();
		visited = new boolean[numbers.length()];
		int[] arr = Arrays.stream(numbers.split(""))
				.mapToInt(Integer::parseInt)
				.toArray();
		for (int i = 1; i<= numbers.length(); i++) {
			int[] resultArr = new int[i];
			perm(arr, resultArr, i, 0);
		}
		return list.size();
	}

	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		if(num == 2 || num == 3) {
			return true;
		}
		int end = (int) Math.sqrt(num);
		for(int i = 2; i <= end; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void perm(int[] arr, int[] resultArr, int r, int index) {
		if(index == r) {
			StringBuilder numStr = new StringBuilder();
			for (int j : resultArr) {
				numStr.append(j);
			}
			int num = Integer.parseInt(numStr.toString());
			if(isPrime(num)) {
				if(!list.contains(num)) {
					list.add(num);
				}
			}
			return;
		}
		for(int i = 0; i < arr.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				resultArr[index] = arr[i];
				perm(arr, resultArr, r, index+1);
				visited[i] = false;
			}
		}
	}
}

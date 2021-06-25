package Algorithm.Java.backjun.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J2309_B2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int sum = Arrays.stream(arr).sum();
		boolean ck = false;
		for (int i = 0; i < 9; i++) {
			if (ck) {
				break;
			}
			for (int j = 0; j < 9; j++) {
				if (i == j) {
					continue;
				}
				if (sum - arr[i] - arr[j] == 100) {
					arr[i] = 0;
					arr[j] = 0;
					ck = true;
					break;
				}
			}
		}
		Arrays.stream(arr)
				.sorted()
				.filter(value -> value != 0)
				.forEach(System.out::println);
	}

}

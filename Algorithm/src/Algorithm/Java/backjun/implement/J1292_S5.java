package Algorithm.Java.backjun.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class J1292_S5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int A = input[0];
		int B = input[1];
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (sb.toString().length() < 3000) {
			for (int j = 0; j < i; j++) {
				sb.append(i).append(" ");
			}
			i++;
		}
		int[] arr = Arrays.stream(sb.toString().split(" ")).mapToInt(Integer::parseInt).toArray();
		int res = IntStream.rangeClosed(A, B).map(j -> arr[j - 1]).sum();
		System.out.println(res);
	}

}

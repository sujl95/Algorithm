package Algorithm.Java.backjun.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class J1065_S4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(N < 100 ? N : (int)(IntStream.rangeClosed(100, N).filter(J1065_S4::isHanSu).count() + 99));
	}

	private static boolean isHanSu(int num) {
		int[] arr = Arrays.stream(Integer.toString(num).split("")).mapToInt(Integer::parseInt).toArray();
		return arr[2] - arr[1] == arr[1] - arr[0];
	}

}

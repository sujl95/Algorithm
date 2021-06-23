package Algorithm.Java.backjun.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class J1065_S4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N < 100) {
			System.out.println(N);
			return;
		}
		int result = 99;
		result += IntStream.rangeClosed(100, N).filter(J1065_S4::isHanNum).count();
		if (N == 1000) {
			result--;
		}
		System.out.println(result);
	}

	private static boolean isHanNum(int num) {
		int hund = num / 100 % 10;
		int ten = num / 10 % 10;
		int one = num % 10;
		return hund - ten == ten - one;
	}

}

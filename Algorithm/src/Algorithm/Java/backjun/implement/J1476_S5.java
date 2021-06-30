package Algorithm.Java.backjun.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J1476_S5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int res = 0;
		int E = 1;
		int S = 1;
		int M = 1;
		while (true) {
			if (E == 16) {
				E = 1;
			}
			if (S == 29) {
				S = 1;
			}
			if (M == 20) {
				M = 1;
			}
			if (E == input[0] && S == input[1] && M == input[2]) {
				break;
			}
			E++;
			S++;
			M++;
			res++;
		}
		System.out.println(res + 1);
	}
}

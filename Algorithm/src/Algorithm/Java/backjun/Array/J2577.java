package Algorithm.Java.backjun.Array;
import java.util.*;
import java.util.stream.Stream;
public class J2577 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
		int A;
		int B;
		int C;
		int[] zero = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		if ((100 <= A && A < 1000) && (100 <= B && B < 1000) && (100 <= C && C < 1000)) {
			int result = A * B * C;
			int[] digits = Stream.of(String.valueOf(result).split("")).mapToInt(Integer::parseInt).toArray();
			for (int digit : digits) {
				if (digit == 0) {
					zero[0] += 1;
				} else if (digit == 1) {
					zero[1] += 1;
				} else if (digit == 2) {
					zero[2] += 1;
				} else if (digit == 3) {
					zero[3] += 1;
				} else if (digit == 4) {
					zero[4] += 1;
				} else if (digit == 5) {
					zero[5] += 1;
				} else if (digit == 6) {
					zero[6] += 1;
				} else if (digit == 7) {
					zero[7] += 1;
				} else if (digit == 8) {
					zero[8] += 1;
				} else if (digit == 9) {
					zero[9] += 1;
				}
			}
			Arrays.stream(zero).forEach(System.out::println);
		}
	}
}

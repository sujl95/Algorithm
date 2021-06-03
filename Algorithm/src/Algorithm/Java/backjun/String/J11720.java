package Algorithm.Java.backjun.string;

import java.util.Scanner;
import java.util.stream.Stream;
public class J11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String str1 = sc.next();
		int[] digits = Stream.of(String.valueOf(str1).split("")).mapToInt(Integer::parseInt).toArray();
		for (int digit : digits) {
			sum += digit;
		}
		System.out.println(sum);
	}

}

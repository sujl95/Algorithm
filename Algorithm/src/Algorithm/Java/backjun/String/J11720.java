package Algorithm.Java.backjun.string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
public class J11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		System.out.println(Arrays.stream(Stream.of(String.valueOf(sc.next()).split("")).mapToInt(Integer::parseInt).toArray()).sum());
	}

}

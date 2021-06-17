package Algorithm.Java.backjun;

import java.util.*;
import java.util.stream.IntStream;

public class J2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		IntStream.range(1, 10).mapToObj(j -> N + " * " + j + " = " + (N * j)).forEach(System.out::println);
	}
}

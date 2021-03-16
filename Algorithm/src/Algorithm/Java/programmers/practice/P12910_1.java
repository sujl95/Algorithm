package Algorithm.Java.programmers.practice;

import java.util.*;

public class P12910_1 {

	public static void main(String[] args) {
		 int[] array = {5, 9, 7, 10};
		 System.out.println(Arrays.toString(divisible(array,5)));
	}

	public static int[] divisible(int[] array, int divisor) {
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
        return Arrays.stream(array).filter(i -> i % divisor == 0).toArray();
    }
}

package Algorism.Java.programmers;

import java.util.stream.IntStream;

public class P70128_1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        solution(a,b);
    }

    public static int solution(int[] a, int[] b) {
        int sum = IntStream.range(0, a.length)
                .map(i -> a[i] * b[i])
                .sum();
        return sum;
    }
}

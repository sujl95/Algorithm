package Algorism.Java.programmers.SummerWinter;

import java.math.BigInteger;

public class P62048 {

    public static void main(String[] args) {
        System.out.println(solution(6,9));
    }

    public static long solution(int w, int h) {
        return ((long) w * h) - ((long)w + h - gcd(w,h));
    }

    public static long gcd(int a , int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

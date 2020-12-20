package Algorism.Java.programmers.SummerWinter;


import java.math.BigInteger;

public class P62048_2 {
    public static void main(String[] args) {
        System.out.println(solution(8, 12));
    }
    public static long solution(int w, int h) {
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        return ((long) w * (long) h) - ((((long) w / gcd) + ((long) h / gcd) - 1) * gcd);
    }
}

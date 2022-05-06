package Algorithm.Java.backjun.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2748_New_피보나치 {

  private static long[] check = new long[91];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    System.out.println(fibo(n));
  }

  private static long fibo(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else if (check[n] != 0) {
      return check[n];
    }
    return check[n] = fibo(n - 1) + fibo(n - 2);
  }

}

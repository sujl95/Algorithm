package Algorithm.Java.ThisisCodingTest.dynamicprogramming;

public class Fibo {

  private long[] arr = new long[91];

  public static void main(String[] args) {
    System.out.println(new Fibo().fibo(10));
  }

  private long fibo(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }
    if (arr[n] != 0){
      return arr[n];
    }
    return arr[n] = fibo(n - 1) + fibo(n - 2);
  }

}

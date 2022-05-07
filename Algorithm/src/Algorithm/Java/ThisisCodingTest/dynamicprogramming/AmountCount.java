package Algorithm.Java.ThisisCodingTest.dynamicprogramming;

import java.util.Arrays;

public class AmountCount {

  public static void main(String[] args) {
    int n = 2;
    int m = 15;

    int[] arr = {2, 3};

    int[] dp = new int[m + 1];

    Arrays.fill(arr, 10001);

    dp[0] = 0;

    for (int i = 0; i < n; i++) {
      for (int j = arr[i]; j < m + 1; j++) {
        if (dp[j - arr[i]] != 10001) {
          dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
        }
      }
    }

    System.out.println(dp[m] == 10001 ? -1 : dp[m]);

  }

}

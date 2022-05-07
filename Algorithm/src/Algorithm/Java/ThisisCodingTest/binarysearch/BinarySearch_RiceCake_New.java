package Algorithm.Java.ThisisCodingTest.binarysearch;

import java.util.Arrays;

public class BinarySearch_RiceCake_New {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {4, 6}, new int[] {19, 15, 10, 17}));
  }

  private static int solution(int[] input, int[] arr) {

    int start = 0;
    int end = Arrays.stream(arr).max().getAsInt();

    int target = input[1];

    while (start <= end) {
      int total = 0;
      int mid = (start + end) / 2;

      for (int i = 0; i < input[0]; i++) {
        if (arr[i] - mid > 0) {
          total += (arr[i] - mid);
        }
      }

      if (total < target) {
        end = mid - 1;
      } else if (total > target) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return 0;
  }

}

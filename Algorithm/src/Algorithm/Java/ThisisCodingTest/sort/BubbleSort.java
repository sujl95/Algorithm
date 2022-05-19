package Algorithm.Java.ThisisCodingTest.sort;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int[] arr = {5, 3, 1, 2, 4, 9, 8, 7};

    int size = arr.length;

    for (int i = 0; i < size - 1; i++) {
      for (int j = 1; j < size - i; j++) {
        if (arr[j - 1] > arr[j]) {
          int temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println("arr = " + Arrays.toString(arr));
  }

}

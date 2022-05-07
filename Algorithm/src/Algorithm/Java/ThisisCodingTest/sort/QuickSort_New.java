package Algorithm.Java.ThisisCodingTest.sort;

import java.util.Arrays;

public class QuickSort_New {

  public static void main(String[] args) {
    int[] arr = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};
    System.out.println("arr = " + Arrays.toString(arr));
    quickSort(arr, 0, arr.length - 1);
    System.out.println("arr = " + Arrays.toString(arr));
  }

  private static void quickSort(int[] arr, int start, int end) {
    if (start >= end) {
      return;
    }

    int pivot = start;
    int left = start + 1;
    int right = end;

    while (left <= right) {
      while (left <= end && arr[left] <= arr[pivot]) {
        left++;
      }
      while (right > start && arr[right] >= arr[pivot]) {
        right--;
      }

      if (left > right) {
        int temp = arr[pivot];
        arr[pivot] = arr[right];
        arr[right] = temp;
      } else {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
      }
      quickSort(arr, start, right - 1);
      quickSort(arr, right + 1, end);
    }


  }


}

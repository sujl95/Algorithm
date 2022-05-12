package Algorithm.Java.etc;

import java.util.Arrays;

public class LiveCodingTest {

  public static void main(String[] args) {
    LiveCodingTest liveCodingTest = new LiveCodingTest();
    liveCodingTest.test3();
  }

  public void test1() {
    /**
     * [문제] 차수를 입력받아 숫자들을 지그재그 ㄹ자로 출력하는 메소드를 작성해보세요.
     *
     * - 예) 차수 : 7
     * 1 2 3 4 5 6 7
     * 14 13 12 11 10 9 8
     * 15 16 17 18 19 20 21
     */

    int n = 7;
    int m = 3;

    int[][] arr = new int[m][n];

    boolean ck = true;
    int value = 1;
    int count = 1;
    int position = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {

        if (ck) {
          arr[i][position++] = value;
        } else {
          arr[i][--position] = value;
        }
        count++;
        value++;
        if (count == 8) {
          ck = ck ? false : true;
          count = 1;
        }
      }
    }
    System.out.println("arr = " + Arrays.deepToString(arr));
  }

  public void test2() {
    /**
     * N개의 숫자들이 입력될 때, 순차 정렬되는 함수를 작성해주세요. (외부 함수 사용 X)
     * 예 : 6 9 3 1 10  => 1 3 6 9 10
     */

    String input = "6 9 3 1 10";

    int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::valueOf).toArray();

    for (int i = 0; i < arr.length; i++) {
      int min = arr[i];
      int idx = i;
      for (int j = i + 1; j < arr.length - 1; j++) {
        if (min > arr[j]) {
          min = Math.min(min, arr[j]);
          idx = j;
        }
      }
      swap(arr, i, idx);
    }
    System.out.println("arr = " + Arrays.toString(arr));
  }

  private void swap(int[] arr, int i, int idx) {
    int temp = arr[i];
    arr[i] = arr[idx];
    arr[idx] = temp;
  }

  public void test3() {
    /**
     * 단어에 나오는 모음의 순서를 바꾸는 함수를 만들어보세요.
     * 예 : naver webtoon => novor webtean
     */

    String input = "naver webtoon";
    char[] arr = input.toCharArray();

    int idx = input.length() - 1;
    for (int i = 0; i < input.length(); i++) {
      if (isConsonant(arr[i])) {
        for (int j = idx - 1; j > 0; j--) {
          if (i < j) {
            if (isConsonant(arr[j])) {
              char temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              idx = j;
              break;
            }
          }
        }
      }
    }
    System.out.println("arr = " + Arrays.toString(arr));
  }

  public boolean isConsonant(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }

}

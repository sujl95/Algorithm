package Algorithm.Java.etc;

import java.util.Arrays;

public class LiveCodingTest {

  public static void main(String[] args) {
    new LiveCodingTest().test1();
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

}

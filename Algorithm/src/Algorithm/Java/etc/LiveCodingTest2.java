package Algorithm.Java.etc;

import java.util.Arrays;

public class LiveCodingTest2 {

  public static void main(String[] args) {
    /**
     * 하나가 10진수를 8진수로변환하는문제
     *
     * 하나는 사물함 n개가 일렬로 서있는데
     * 학생 m명이 일정한규칙으로 사물함을 열고 닫는다
     * 첫번째학생은 2의배수마다 열거나 닫고 2번째학생은 3의배수마다 열거나닫고 마지막 m번째학생은 m+1 의 배수마다 열거나닫는다
     * 열려있는 사물함개수는?
     *
     * 하나는 n명의 학생이 토너먼트로 게임을진행할때 우승하기위해선 몇명을 이겨야하는가
     */
    LiveCodingTest2 liveCodingTest2 = new LiveCodingTest2();
    liveCodingTest2.test1();
    liveCodingTest2.test2();
  }

  private void test1() {
    int num = 127;
    StringBuilder sb = new StringBuilder();
    while (num != 0) {
      sb.append(num % 8);
      num /= 8;
    }
    System.out.println(sb.reverse());
  }

  private void test2() {
    /**
     * 사물함 n개가 일렬로 서있는데 학생 m명이 일정한 규칙으로 사물함을 열고 닫는다
     * 첫번째 학생은 2의배수마다 열거나 닫고 2번째 학생은 3의배수마다 열거나닫고 마지막 m번째 학생은 m+1 의 배수마다 열거나닫는다
     * 열려있는 사물함개수는?
     */
    int n = 10;
    int m = 5;

    boolean[] arr = new boolean[n + 1];

    for (int i = 2; i < m + 2; i++) {
      for (int j = 2; j < arr.length; j++) {
        if (j % i == 0) {
          arr[j] = !arr[j];
        }
      }
    }

    System.out.println(Arrays.toString(arr));
  }

  private void test3() {
    /**
     * n명의 학생이 토너먼트로 게임을진행할때 우승하기위해선 몇명을 이겨야하는가
     */

    /**
     *
     * 5
     *        1
     *     1   1
     *  1   1  1
     * 1 1 1 1 1
     *
     * 6
     *
     *    1   1
     *  1   1   1
     * 1 1 1 1 1 1
     *
     */


  }

}

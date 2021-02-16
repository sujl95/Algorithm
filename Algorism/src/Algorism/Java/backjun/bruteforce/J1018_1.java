package Algorism.Java.backjun.bruteforce;

import java.util.*;

public class J1018_1 {
   // 전역 변수
   public static int start_i = 0;   // 카피 시작 좌표 X
   public static int start_j = 0;   // 카피 시작 좌표 Y
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // N * M 입력 받기
      String[][] str = new String[sc.nextInt()][sc.nextInt()];
      // 최솟값 초기값 입력 -> 바뀌는 횟수는 N * M 을 초과할수 없음
      int min = str.length * str[0].length;
      // 예제 맵 입력 받기
      String s = "";
      for(int i = 0; i < str.length; i++) {
         s = sc.next();
         str[i] = s.split("");
      }
      System.out.println(Arrays.deepToString(str));
      // 검사
      for(int i = 0; i <= str.length-8; i++) {
         for(int j = 0; j <= str[0].length-8; j++) {
            String[][] arr = new String[8][8];
            arr = copyVal(str);
            min = cntChange(arr, min, true);
            start_j++;
         }
         start_i++;
         start_j = 0;
      }
      // 최솟값 출력
      System.out.println(min);
   }
   
   // 좌표에 따른 배열 복사 메소드
   public static String[][] copyVal(String[][] str) {
      String[][] arr = new String[8][8];
      int a = 0, b = 0;
      for(int i = start_i; i < start_i+8; i++) {
         for(int j = start_j; j < start_j+8; j++) {
            arr[a][b] = str[i][j];
            b++;
         }
         a++;
         b = 0;
      }
      return arr;
   }
   
   // 카운트 값 체크 메소드 -> 재귀를 이용해서 첫 문자가 W일때와 B일때를 각각 체크
   public static int cntChange(String[][] str, int min, boolean is) {
      int cnt = 0;
      String check = (is)? "W" : "B";
      for(int i = 0; i < 8; i++) {
         for(int j = 0; j < 8; j++) {
            if((i+j) % 2 == 0) {
               if(!str[i][j].equals(check)) {
                  cnt++;
               }
            }
            else {
               if(str[i][j].equals(check)) {
                  cnt++;
               }
            }
         }
      }
      min = (min > cnt)? cnt : min;
      if(is) {
         return cntChange(str, min, false);  
      }
      return min;
   }
}
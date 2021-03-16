package Algorithm.Java.programmers.practice;

import java.util.Arrays;

public class P12915 {

   public static void main(String[] args) {
      String arr[] = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
      System.out.println(Arrays.toString(solution(arr,2)));
      
   }
   public static String[] solution(String[] strings, int n) {
         for (int i=0; i<strings.length; i++) {
        	 strings[i] = strings[i].substring(n, n+1)+strings[i];
         }
         Arrays.sort(strings);
         String[] answer = new String[strings.length];
         for(int i=0;i<strings.length;i++) {
        	 answer[i]= strings[i].substring(1);
         }
         return answer;
    }
}
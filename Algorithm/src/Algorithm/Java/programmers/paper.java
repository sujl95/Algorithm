package Algorithm.Java.programmers;

import java.util.Arrays;
import java.util.Scanner;
public class paper {

	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      solution(sc.nextInt());
	      //종이접기 문제 풀기
	      // 1. n == 1이면 [0] 리턴
	      // 2. 배열의 크기는 2의 n승 - 1
	      // 3. n의 배열은 n - 1 배열의 사이사이에 0과 1을 반복해서 끼워넣은 모양이다
	   }
	   
	   public static int[] solution(int n) {
	        int[] answer = {};
	        String str = "";
	        for(int i = 0; i < n; i++) {        
	            String str1 = "";
	            String[] arr = str.split("");
	            
	            for(int j = arr.length-1; j >= 0; j--) {
	                if(arr[j].equals("0")) {
	                    str1 += "1";
	                }
	                else if(arr[j].equals("1")) {
	                    str1 += "0";
	                }
	            }
	            str += "0" + str1;
	        }
	        String[] a = str.split("");
	         
	        
	        answer = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
	      
	       System.out.println(Arrays.toString(answer));
	        return answer;
	    }
	   static int[] func(int n)  { //n ==2 
	      if (n == 1) return new int [] {0};
	      //그 배열의 사이사이에 0과 1을 반복적으로 끼워넣어야함
	      //짝수일때는 0, 1 을 반복해서 넣어주고
	      //홀수일때는 기존배열의 원소들을 하나씩 넣어준다
	      int[] arr = func(n-1);
	      int[] rtn = new int [ arr.length * 2+1];
	      for (int i = 0 ; i < rtn.length; i++) {
	         if(i % 2 == 0 ) { // 0과 1을 반복해서 넣어주는 구문
	            // 0 2 4 6 8 10 12 //4로 나눈 나머지가 0 이면 0을 넣어주고 아니면 1
	            // 0 1 0 1 0 1 0
	            rtn[i] = i % 4 == 0 ? 0 : 1;
	         } else { //기존 배열의 원소를 하나씩 넣어주는 구문
	            rtn[i] = arr[ i / 2] ;
	         }
	      }
	      return rtn;
	   }
	   
	   static int[] func1(int n) {
	      if (n == 1)
	         return new int[] { 0 };
	      StringBuffer sb = new StringBuffer();
	      int[] arr = func(n - 1);
	      for (int i : arr)
	         sb.append(i);
	      StringBuffer sb2 = new StringBuffer(sb).reverse();
	      sb.append("0");
	      for (byte b : sb2.toString().getBytes())
	         sb.append(b == '0' ? 1 : 0);
	      int[] rtn = new int[sb.length()];
	      int idx = 0;
	      for (Byte b : sb.toString().getBytes())
	         rtn[idx++] = b == '0' ? 0 : 1;
	      return rtn;

	   }


}

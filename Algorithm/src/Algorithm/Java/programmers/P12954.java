package Algorithm.Java.programmers;

import java.util.Arrays;

public class P12954 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(solution(4,1)));
	}
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		long cnt =0;
	      boolean ck = (Long.toString(n).charAt(0) == '-') ? false : true;
	      for(int i=0; i<answer.length; i++){
	          if(ck == false)  {
	              cnt -= x;
	          } else {
	              cnt += x;
	          }
	          answer[i] = cnt;
	      }
	      return answer;
    }
}

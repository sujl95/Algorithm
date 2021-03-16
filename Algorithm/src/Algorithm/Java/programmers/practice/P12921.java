package Algorithm.Java.programmers.practice;

import java.util.Arrays;

public class P12921 {

	public static void main(String[] args) {
		//https://programmers.co.kr/learn/courses/30/lessons/12921
		//소수 찾기
		System.out.println(solution(10));
	}
	public static int solution(int n) {
		int answer = 0;
	      boolean[] prime=new boolean[n+1];
	      Arrays.fill(prime, true);
	      prime[0]=prime[1]=false;
	      int rootN=(int)Math.sqrt(n);
	      for(int i=2;i<=rootN;i++){
	          if(!prime[i]) continue;
	          for(int j=i+i;j<=n;j+=i){
	              prime[j]=false;
	          }
	      }
	      for(boolean num:prime){
	          if(num) answer++;
	      }
	      return answer;
//	     for(int i = 2; i<=n;i++) {
//	    	 int ck=0;
//	    	 for(int j=2;j<=i;j++) {
//	    		 if(i%j== 0) {
//	    			 ck++;
//	    		 }
//	    		 if(ck > 1) break;
//	    	 }
//	    	 if(ck==1) cnt++;
//	     }
	}
	
}

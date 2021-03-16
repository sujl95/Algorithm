package Algorithm.Java.programmers.greedy;

import java.util.Stack;

public class P42883_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("4177252841",4));
	}
	public static String solution(String str, int k) {

	      Stack<Character> stk = new Stack<>();
	
	      for(int i =0 ; i < str.length(); ++i)  {
	    	  final char val = str.charAt(i);
	    	  for (; !stk.isEmpty() && k>0 ; --k) {
	    		  final char p = stk.peek();
	    		  if(p>= val) break;
	    			  stk.pop();
	    	  }
	    	  stk.push(val);
	      }
	      
	      
	      for (; k> 0 ; --k) stk.pop();
	      
	      StringBuilder ans = new StringBuilder();
	      for(char x : stk) ans.append(x);
	     return ans.toString();
    }
}

package Algorism.programmers;
import java.util.*;
public class P42883_1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      String str = sc.next();
	      Stack<Character> stk = new Stack<>();
	      int k = sc.nextInt();
	      for ( int i = 0; i < str.length(); i++) {
	    	  final char c = str.charAt(i);
//	    	  stk.push(c);
	    	  System.out.println(stk.peek());
	      }
	      
	      System.out.println(stk);
	      
	}
	
	

}













//Scanner sc = new Scanner(System.in);
//String str = sc.next();
//Stack<Character> stk = new Stack<>();
//int k = sc.nextInt();
//for(int i =0 ; i < str.length(); ++i)  {
//	  final char val = str.charAt(i);
//	  for (; !stk.isEmpty() && k>0 ; --k) {
//		  final char p = stk.peek();
//		  if(p>= val) break;
//			  stk.pop();
//	  }
//	  stk.push(val);
//}
//System.out.println(stk);
//
//for (; k> 0 ; --k) stk.pop();
//
//StringBuilder ans = new StringBuilder();
//for(char x : stk) ans.append(x);
//System.out.println(ans.toString());
package Algorism.Java.backjun.Array;
import java.util.*;
import java.util.stream.Stream;
public class J2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      int A,B,C;
	     
	     
	      int zero[] = {0,0,0,0,0,0,0,0,0,0};
	      A = sc.nextInt();
	      B = sc.nextInt();
	      C = sc.nextInt();
	     
	      if ((100<= A && A <1000) && (100<= B && B <1000) && (100<= C && C <1000)) {
	    	  int result=0;
	    	  result = A * B * C;
	    
	      
	      int[] digits = Stream.of(String.valueOf(result).split("")).mapToInt(Integer::parseInt).toArray();
	     
	      
	    	  for (int i = 0; i< digits.length ;i++) {
	        	  if (digits[i] == 0) {
	        		  zero[0] += 1;
	        	  }
	        	  else if (digits[i] == 1) {
	        		  zero[1] += 1;
	        	  }
	        	  else if (digits[i] == 2) {
	        		  zero[2] += 1;
	         	  }
	        	  else if (digits[i] == 3) {
	        		  zero[3] += 1;
	        	  }
	        	  else if (digits[i] == 4) {
	        		  zero[4] += 1;
	        	  }
	        	  else if (digits[i] == 5) {
	        		  zero[5] += 1;
	        	  }
	        	  else if (digits[i] == 6) {
	        		  zero[6] += 1;
	        	  }
	        	  else if (digits[i] == 7 ) {
	        		  zero[7] += 1;
	        	  }
	        	  else if (digits[i] == 8) {
	        		  zero[8] += 1;
	        	  }
	        	  else if (digits[i] == 9) {
	        		  zero[9] += 1;

	        	  }
	        	
	          }
	      
	      System.out.println(zero[0]);
	      System.out.println(zero[1]);
	      System.out.println(zero[2]);
	      System.out.println(zero[3]);
	      System.out.println(zero[4]);
	      System.out.println(zero[5]);
	      System.out.println(zero[6]);
	      System.out.println(zero[7]);
	      System.out.println(zero[8]);
	      System.out.println(zero[9]);
	      }
	}

}

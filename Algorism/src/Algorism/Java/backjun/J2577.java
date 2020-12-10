import java.util.*;
import java.util.Arrays;
import java.util.stream.Stream;
public class J2577 {

   public static void main(String[] args) {
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
        	  for(int j =0 ; j<=9; j++) {
    		  
        		  if(digits[i] == j) {
        			  zero[j] += 1;
        		  }
        	
        	  }
          }
	      for (int k = 0;k<=9; k++) {
	    	  System.out.println(zero[k]);
	      }
      }
   }

}
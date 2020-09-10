package Algorism.programmers;
import java.util.*;
public class P42883 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      int N = sc.nextInt();
      String [] arr = new String[str.length()];
      arr = str.split("");
      System.out.println(Arrays.deepToString(arr));
      int cnt = 0;
      if ((int)arr.length/2 > arr.length-N) {
    	  cnt = arr.length-N;
      }
      else {
    	  cnt = N;
      }
      cnt = arr.length - N;
      String s = "0";
      String [] ans = new String[cnt];
      int index = 0;
      int j =0;
      int indexsave = 0;
//      System.out.println("cnt"+cnt);
      for ( int i = 0 ; i < arr.length; i++) {
         for (j =index ; j < cnt; j++ ) {
            System.out.println("j>>>>>>>>>"+j);
            if((Integer.parseInt(arr[j])) > (Integer.parseInt(s))  ) {
               s =  arr[j]  ;
               indexsave = j;
               System.out.println("indexsave"+indexsave);
               System.out.println("arr[j]"+arr[j]);
               System.out.println("s"+s);
               System.out.println("j"+j);
            }
            
         }
         System.out.println("i"+ i +"j"+j);
         ans[i] = s;
         cnt++;
         s = "0";
         System.out.println("j"+j);
         if (indexsave ==index) {
         	System.out.println("체크");
         	index++;
         }
         else {index = indexsave+1;}
         System.out.println(index);
         System.out.println(Arrays.toString(ans));
      }
   }

}
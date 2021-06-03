package Algorithm.Java.backjun.word;

import java.util.Arrays;
import java.util.Scanner;

public class J1157 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      char alpha[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
      int acnt[] = new int[26];
      String str = sc.nextLine();
      str = str.toUpperCase();
      System.out.println(str);
      int cnt = 0;
      int ck =0;
      char result = ' ';
      for (int i = 0; i  < str.length(); i++) {
    	  for(int j =0 ; j < alpha.length; j++) {
    		  if(str.charAt(i) == alpha[j]) {
    			  acnt[j]++;
    		  }
    	  }
      }
      for(int i =0; i <alpha.length; i++) {
    	  if (acnt[i] > cnt) {
    		 cnt = acnt[i];
    		 result = alpha[i];
    	  }
      }
      for(int i=0; i<acnt.length; i++) {
    	  if(cnt == acnt[i]) {
    		  ck++;
    	  }
      }
      System.out.println(ck);
      System.out.println(Arrays.toString(acnt));
      System.out.println(result = (ck >= 2) ? '?' : result );
      System.out.println('a' -'c');
      System.out.println((char)(65));
	}

}

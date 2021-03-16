package Algorithm.Java.programmers.practice;

import java.text.SimpleDateFormat;
import java.util.*;

public class P12901 {

	public static void main(String[] args) throws Exception {
		System.out.println(solution(5,24));
	}
	
	public static String solution(int a, int b) throws Exception {
		 
		String arr[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		String answer;

		SimpleDateFormat dateFormat = new SimpleDateFormat("2016-05-24", Locale.KOREA) ;
	    Date nDate = dateFormat.parse("2016-05-24") ;
	     
	    Calendar cal = Calendar.getInstance() ;
	    cal.setTime(nDate);
	    System.out.println(cal);
	    int dayNum = cal.get(Calendar.DAY_OF_WEEK) ;
      	Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1);
		System.out.println(cal1.get(Calendar.DAY_OF_WEEK)-1);
		answer = arr[cal1.get(Calendar.DAY_OF_WEEK)-1];
		return answer;
	}

	
}

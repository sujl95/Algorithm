package Algorithm.Java.programmers;

import java.text.SimpleDateFormat;
import java.util.*;

public class P12901 {

	public static void main(String[] args) throws Exception {
		System.out.println(solution(5,24));
	}
	
	public static String solution(int a, int b) throws Exception {
		 
		String arr[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		String answer = "";
	     
	    String day = "" ;
	     
	    SimpleDateFormat dateFormat = new SimpleDateFormat("2016-05-24", Locale.KOREA) ;
	    Date nDate = dateFormat.parse("2016-05-24") ;
	     
	    Calendar cal = Calendar.getInstance() ;
	    cal.setTime(nDate);
	    System.out.println(cal);
	    int dayNum = cal.get(Calendar.DAY_OF_WEEK) ;
	    System.out.println(cal.get(dayNum));
      System.out.println(arr[dayNum]);
      Calendar cal1 = Calendar.getInstance();
//      Date dt = dateFormat.parse("2016-05-24");
//      cal.set(2016, a, b);
//      cal.set(2020, 03, 06);
      System.out.println(cal1);
      System.out.println(cal1.get(cal1.DAY_OF_WEEK)-1);
	  answer = arr[cal1.get(cal1.DAY_OF_WEEK)-1]; 
      return answer;
	}

	
}

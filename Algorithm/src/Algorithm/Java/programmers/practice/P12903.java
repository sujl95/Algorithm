package Algorithm.Java.programmers.practice;

public class P12903 {

	public static void main(String[] args) {
		System.out.println(solution("abc"));
	}
	public static String solution(String word) {
      String answer = "";
//      int a =0;
//      int b =0;
//      if(s.length()%2 == 0 ) {
//    	 a = s.length()/2-1;
//    	 b = s.length()/2+1;
//      } else {
//    	  a = s.length()/2;
//    	  b = s.length()/2+1;
//      }
//      answer = s.substring(a, b);
      return word.substring((word.length()-1) / 2, word.length()/2 + 1) ;
    }
}

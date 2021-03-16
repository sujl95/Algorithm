package Algorithm.Java.programmers.practice;

public class P12948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("01033334444"));
	}
	public static String solution(String phone_number) {
	      
		char[] ch = phone_number.toCharArray();
	     for(int i = 0; i < ch.length - 4; i ++){
	         ch[i] = '*';
	     }
	     return String.valueOf(ch);
//		/*
//		 * String answer = ""; String save
//		 * =phone_number.substring(phone_number.length()-4, phone_number.length());
//		 * for(int i=0; i < phone_number.length()-4; i++){ answer += "*"; }
//		 * 
//		 * return answer+save;
//		 */
	}
}

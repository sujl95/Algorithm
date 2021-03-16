package Algorithm.Java.programmers.practice;

public class P12926 {

	public static void main(String[] args) {
		//https://programmers.co.kr/learn/courses/30/lessons/12926
		//시저 암호
		System.out.println(""+solution("a B z", 4));

	}
	public static String solution(String s, int n) {
	    String answer = "";
	    for(int i=0; i<s.length();i++) {
	    	//a = 97 z= 122, A=65 Z=90 
	    	char ch=s.charAt(i);
	    	if(Character.isLowerCase(ch)) {
	    		ch = (char)((ch -'a' +n)%26 + 'a');
	    	} else if(Character.isUpperCase(ch)) {
	    		ch = (char)((ch - 'A' + n) % 26+ 'A');
	    	}
	    	
	    	answer+= ch;
	    	
	    }
	    return answer;
//	    for(int i=0; i<s.length();i++) {
//	    	//a = 97 z= 122, A=65 Z=90 
//	    	if(s.charAt(i) != ' ') {
//	    		if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
//	    			if(s.charAt(i)+n > 122) {
//	    				answer += (char)(s.charAt(i)+n-26);
//	    			} else {
//	    				answer += (char)(s.charAt(i)+n);
//	    			}
//	    		} else if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
//	    			if(s.charAt(i)+n > 90) {
//	    				answer += (char)(s.charAt(i)+n-26);
//	    			} else {
//	    				answer += (char)(s.charAt(i)+n);
//	    			}
//	    		}
//	    	} else {
//	    		answer += ' ';
//	    	}
//	    }
//	    return answer;
    }
}

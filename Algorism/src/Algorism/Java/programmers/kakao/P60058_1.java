package Algorism.Java.programmers.kakao;

public class P60058_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(resString("(()()))()("));
	}
	
	public static boolean checkString(String s) {
		
		int open = 0;
		for ( int i = 0; i<s.length();i++) {
			if(s.charAt(i) == '(') {
				open++;
			} else {
				if(open == 0) return false;
				open--;
			}
		}
		return true;
	}
	
	
	public static String resString(String s) {
		if(s.length() == 0) return s;
		int open = 0, close=0;
		for(char c : s.toCharArray()) {
			if( c == '(') open++;
			else close++;
			if(open == close) break;
		}
		int len = open + close;
		String u = s.substring(0, len);
		String v = s.substring(len);
		if(checkString(u)) {
			return u+resString(v);
		} else {
			String res = "("+resString(v)+")";
			for(int i = 1; i< len-1;i++) {
				if(u.charAt(i) =='(') {
					res+= ")";
				} else {
					res += "(";
				}
			}
			return res;
		}
		
	}
}

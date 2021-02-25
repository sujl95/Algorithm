package Algorithm.Java.programmers.kakao;

import java.util.Arrays;
import java.util.Stack;

public class P60058 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(balString("(()))(")));
	}
	
	public static String solution(String s) {
		String answer = "";
		if (checkString(s)) {
			return s;
		}
        answer = transString(s);
        return answer;
    }
	
	public static boolean checkString(String s) {
		if (s.charAt(0) == ')' || s.length() < 2) {
			return false;
		}
		Stack<Character> stk = new Stack<>();
		stk.add('(');
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				stk.add(c);
				continue;
			}
			if (stk.isEmpty()) {
				return false;
			}
			stk.pop();
		}
		return stk.isEmpty();
	}
	public static String[] balString(String s) {
		String[] arr = {"", ""};
		if(s.length() == 0)
			return arr;
		char ck = s.charAt(0);
		Stack<Character> stk = new Stack<>();
		stk.add(ck);
		int idx = -1;
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (stk.isEmpty()) {
				idx = i;
				break;
			}
			if (c == ck) {
				stk.add(c);
				continue;
			}
			stk.pop();
		}
		if (idx < 0) {
			arr[0] = s;
			arr[1] = "";
			return arr;
		}
		arr[0] = s.substring(0, idx);
		arr[1] = s.substring(idx);
		return arr;
	}
	
	public static String transString(String s) {
		if (s.length() == 0) {
			return s;
		}
		String str;
		String[] uv = balString(s);
		String u = uv[0];
		String v = uv[1];
		String nv = transString(v);
		boolean ck = checkString(u);
		if(ck) {
			str = u + nv;
			return str;
		}
		str = "(";
		str += nv;
		str += ")";
		if(s.length() > 2) {
			StringBuilder tmp = new StringBuilder();
			for( int i=1; i<u.length()-1; i++) {
				char c = u.charAt(i);
				if(c == '(') {
					tmp.append(")");
					continue;
				}
				tmp.append("(");
			}
			str += tmp;
		}
		return str;
	}
}

package Algorithm.Java.programmers.kakao;

import java.util.*;

public class P60057 {

	public static void main(String[] args) {
		System.out.println(solution(new Scanner(System.in).nextLine()));
	}
	
	
	public static int solution(String s) {
		int answer = s.length() ;
		for (int i = 1; i <= s.length() / 2; i++) {
			int result = check(s, i);
			if (result < answer) {
				answer = result;
			}
		}
		return answer ;
    }
	
	public static int check(String s, int size) {
		StringBuilder result= new StringBuilder();
		List<String> words = new ArrayList<String>();
		int exist = s.length() % size;
		for (int i = 0; i <= s.length() - size; i += size) {
			words.add(s.substring(i, i + size));
		}
		int cnt = 1 ;
		for (int i = 0; i < words.size() - 1; i++) {
			if (words.get(i).equals(words.get(i + 1))) {
				cnt++;
			} else {
				if (cnt > 1)
					result.append(cnt).append(words.get(i));
				else
					result.append(words.get(i));
				cnt = 1;
			}
		}
		if (cnt > 1) {
			result.append(cnt).append(words.get(words.size() - 1));
		} else {
			result.append(words.get(words.size() - 1));
		}
		
		return result.length()+exist;
	}
}

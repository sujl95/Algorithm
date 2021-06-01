package Algorithm.Java.codingTest._20210601_EST_Soft_One_touch;

public class _1 {

	public static void main(String[] args) {
		String p = "101";
		String s = "10100010101101100";
		System.out.println("solution(p, s) = " + solution(p, s));
	}

	// p 문자열
	// s 문자열



	public static int solution(String p, String s) {
		int answer = 0;
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			char charS = s.charAt(i);
			char charP = p.charAt(cnt);
			if (charS == charP) {
				cnt++;
				answer++;
			}
			if (cnt == p.length()) {
				cnt = 0;
			}
		}
		if (answer == s.length()) {
			answer = -1;
		}

		return s.length() - answer;
	}


}

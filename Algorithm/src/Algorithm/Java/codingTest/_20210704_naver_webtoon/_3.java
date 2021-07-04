package Algorithm.Java.codingTest._20210704_naver_webtoon;

public class _3 {

	public static void main(String[] args) {
		System.out.println(solution("abababccc", "ab"));
	}

	public static int solution(String s, String t) {
		int res = 0;
		while (true) {
			String temp = s.replaceAll(t, "");
			int sLength = s.length();
			int tempLength = temp.length();
			s = temp;
			if (sLength != tempLength) {
				int value = sLength - tempLength;
				res += value / t.length();
				continue;
			}
			break;
		}
		return res;
	}

}

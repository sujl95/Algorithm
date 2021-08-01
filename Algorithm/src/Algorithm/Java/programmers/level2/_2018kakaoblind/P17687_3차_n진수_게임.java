package Algorithm.Java.programmers.level2._2018kakaoblind;

public class P17687_3차_n진수_게임 {

	public static void main(String[] args) {
		// System.out.println("solution(2,4,2,1) = " + solution(2,4,2,1));
		System.out.println("solution(16,16,2,2) = " + solution(16, 16, 2, 2));
	}

	public static String solution(int n, int t, int m, int p) {
		String str = "0";
		int count = 1;
		while (str.length() < t * m + p) {
			String strNum = "";
			int num = count++;
			while (num != 0) {
				int remainder = num % n;
				if (remainder >= 10) {
					strNum += (char) (remainder + 55);
				} else {
					strNum += remainder;
				}
				num /= n;
			}
			str += new StringBuilder(strNum).reverse().toString();
		}
		String res = "";
		for (int i = 0; i < t; i++) {
			res += str.charAt(m * i + p - 1);
		}
		return res;
	}
}

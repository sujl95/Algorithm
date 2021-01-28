package Algorism.Java.programmers.level2.practice;

public class P12911_NextNumber2 {
	public static void main(String[] args) {
		System.out.println(solution(78));
	}

	public static int solution(int n) {
		int nCnt = Integer.bitCount(n);
		while (true) {
			if (Integer.bitCount(++n) == nCnt) {
				break;
			}
		}
		return n;
	}
}

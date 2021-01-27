package Algorism.Java.programmers.level2.practice;

public class P12911_NextNumber {
	public static void main(String[] args) {
		System.out.println(solution(78));
	}

	public static int solution(int n) {
		String replaceN = Integer.toBinaryString(n).replace("0", "");
		while (true) {
			if (replaceN.equals(Integer.toBinaryString(++n).replace("0", ""))) {
				break;
			}
		}
		return n;
	}
}

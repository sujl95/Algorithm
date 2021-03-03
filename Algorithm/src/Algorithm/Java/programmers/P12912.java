package Algorithm.Java.programmers;

public class P12912 {

	public static void main(String[] args) {
		System.out.println(solution(5,3));
	}
	
	public static long solution(int a, int b) {
        long answer = 0;
		if (a == b) {
			answer = a;
		} else {
			if (a > b) {
				for (; b <= a; b++) {
					answer += b;
				}
			} else {
				for (; a <= b; a++) {
					answer += a;
				}
			}
		}
        return answer;
    }
}

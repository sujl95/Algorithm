package Algorithm.Java.codingTest._20210724_ChannelTalk;

public class _1 {

	public static void main(String[] args) {
		System.out.println("solution(12) = " + solution(12));
	}

	public static int solution(int b) {
		int answer = -1;
		double db = b;
		for (double i = 1; i <= b; i++) {
			double c = Math.sqrt(i * i + db * db);
			if (c - (int) c == 0) {
				answer = (int) c;
				break;
			}
		}
		return answer;
	}

}

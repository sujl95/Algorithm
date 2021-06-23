package Algorithm;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// String[] today = {"A","C","B","D","G","E"};
		// String[] yesterday = {"E","C","G","A","B","D"};
		String[] today = {"A","B","C","D"};
		String[] yesterday = {"C","D","A","B"};
		int[] answer = new int[6];
		for (int i = 0; i < yesterday.length; i++) {
			for (int j = 0; j < today.length; j++) {
				if (today[j].equals(yesterday[i])) {
					answer[i] = i - j;
					break;
				}
			}
		}
		System.out.println("answer = " + Arrays.toString(answer));
	}
}

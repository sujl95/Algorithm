package Algorithm;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		String[] targets = {"A","C","B","D","G","E"};
		String[] arr = {"E","C","G","A","B","D"};
		int[] answer = new int[6];
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			for (int j = 0; j < targets.length; j++) {
				if (targets[j].equals(s)) {
					answer[i] = j - i;
					break;
				}
			}
		}
		System.out.println("answer = " + Arrays.toString(answer));
	}
}

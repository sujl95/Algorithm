package Algorithm.Java.backjun.string;

import java.util.Scanner;

public class J6550_S5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] arr = sc.nextLine().split(" ");

			String[] word1 = arr[0].split("");
			String[] word2 = arr[1].split("");
			int pos = 0;
			String answer = "Yes";
			for (String s : word1) {
				boolean check = false;
				for (int j = pos; j < word2.length; j++) {
					if (s.equals(word2[j])) {
						pos = j + 1;
						check = true;
						break;
					}
				}
				if (!check) {
					answer = "No";
					break;
				}
			}
			System.out.println(answer);
		}

	}

}

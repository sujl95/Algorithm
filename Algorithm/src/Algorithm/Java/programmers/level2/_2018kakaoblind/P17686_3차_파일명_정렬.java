package Algorithm.Java.programmers.level2._2018kakaoblind;

import java.util.Arrays;

public class P17686_3차_파일명_정렬 {

	public static void main(String[] args) {
		// String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		// String[] files = {"A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"};
		String[] files = {"img000012345", "img1.png","img2","IMG02"};
		System.out.println("solution() = " + Arrays.toString(solution(files)));
	}

	public static String[] solution(String[] files) {
		Arrays.sort(files, (o1, o2) -> {
			String head1 = o1.split("[0-9]")[0];
			String head2 = o2.split("[0-9]")[0];
			if (!head1.equalsIgnoreCase(head2)) {
				return head1.toLowerCase().compareTo(head2.toLowerCase());
			} else {
				return transfer(o1, head1) - transfer(o2, head2);
			}
		});
		return files;
	}
	private static int transfer(String target, String slice) {
		String res = "";
		for (int i = slice.length(); i < target.length(); i++) {
			char c = target.charAt(i);
			if (Character.isDigit(c) && res.length() < 5) {
				res += c;
			} else {
				break;
			}
		}
		return Integer.parseInt(res);
	}

}

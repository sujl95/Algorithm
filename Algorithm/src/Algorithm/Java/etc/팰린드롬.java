package Algorithm.Java.etc;

public class 팰린드롬 {

	public static void main(String[] args) {
		String input = "abababcabababa";
		boolean isPair = false;
		if (input.length() % 2 == 0) {
			isPair = true;
		}
		int idx = input.length() / 2;
		int leftIdx = idx - 1;
		int rightIdx;
		if (isPair) {
			rightIdx = idx;
		} else {
			rightIdx = idx + 1;
		}
		while (true) {
			char left = input.charAt(leftIdx);
			char right = input.charAt(rightIdx);
			if (left != right) {
				System.out.println("false");
				return;
			}
			if (leftIdx == 0 || input.length() - 1 ==  rightIdx) {
				break;
			}
			if (leftIdx > 0) {
				leftIdx--;
			}
			if (rightIdx < input.length()) {
				rightIdx++;
			}
		}
		System.out.println("true");
	}

}

package Algorithm.Java.codingTest._20210320_LINE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2 {
	public static void main(String[] args) {
		String str = "aaaaZZZZ)";
		String str1 = "asdfasdf";
		System.out.println("solution() = " + Arrays.toString(solution("UUUUU")));
	}

	public static int[] solution(String password) {
		List<Integer> answers = new ArrayList<>();
		if (password.length() < 8 || password.length() > 15) {
			answers.add(1);
		}
		String pwPattern = "^(?=.*\\d)(?=.*[~!@#$%\\^&*])(?=.*[a-z])(?=.*[A-Z])$";
		Matcher matcher = Pattern.compile(pwPattern).matcher(password);

		String pwPattern1 = "(.)\\1\\1\\1\\1";
		Matcher matcher2 = Pattern.compile(pwPattern1).matcher(password);

		String pwPattern2 = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[$~!@#$%\\^&*])";
		Matcher matcher3 = Pattern.compile(pwPattern2).matcher(password);
		if(!matcher.matches()){
			answers.add(2);
		}

		if(!matcher3.find()){
			answers.add(3);
		}

		if (continueNumberCheck(password)) {
			answers.add(4);
		}

		if (matcher2.find()) {
			answers.add(5);
		}

		System.out.println("answers = " + answers);
		if (answers.size() == 0) {
			return new int[] {0};
		}
		return 	answers.stream().mapToInt(i -> i).toArray();
	}

	public static boolean continueNumberCheck(String numberCheck){
		int o = 0;
		int d = 0;
		int p = 0;
		int n = 0;
		int limit = 4;

		for(int i = 0 ; i < numberCheck.length() ; i++) {
			char tempVal = numberCheck.charAt(i);
			if (i > 0 && (p = o - tempVal) > -2 && p < 2 && (n = p == d ? n + 1 : 0) > limit - 3)
				return true;
			d = p;
			o = tempVal;
		}

		return false;
	}
}

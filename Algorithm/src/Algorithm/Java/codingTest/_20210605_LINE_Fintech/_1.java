package Algorithm.Java.codingTest._20210605_LINE_Fintech;

import java.util.ArrayList;
import java.util.List;

public class _1 {

	public static void main(String[] args) {
		System.out.println("solution(\"7234032479947\") = " + solution("7234032479947"));
	}

	public static int solution(String inputString) {
		int pos = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < inputString.length(); i++) {
			String temp = String.valueOf(inputString.charAt(i));

			for (; pos < 1000; pos++) {
				String posStr = String.valueOf(pos);
				if (pos < 10) {
				} else if (10 <= pos && pos < 100 && i + 1 < inputString.length()) {
					// if (posStr.equals(temp + inputString.charAt(i + 1))) {
					if (posStr.contains(temp)) {
						list.add(Integer.parseInt(posStr));
						i++;
						pos++;
						break;
					}
				} else if (100 <= pos && pos < 1000 && i + 2 < inputString.length()) {
					// if (posStr.equals(temp + inputString.charAt(i + 1) + inputString.charAt(i + 2))) {
					if (posStr.contains(temp)) {
						list.add(Integer.parseInt(posStr));
						i += 2;
						pos++;
						break;
					}
				}
				boolean contains = posStr.contains(temp);
				if (contains) {
					list.add(Integer.parseInt(posStr));
					break;
				}
			}
		}
		return list.get(list.size() - 1);
	}
}

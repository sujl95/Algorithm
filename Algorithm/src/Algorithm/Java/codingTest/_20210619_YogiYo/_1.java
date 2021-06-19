package Algorithm.Java.codingTest._20210619_YogiYo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class _1 {

	public static void main(String[] args) {
		String S = "John Doe, Peter Benjamin Parker, Mary Jane Watson-Parker, John Elvis Doe, John Evan Doe, Jane Doe, Peter Brian Parker";
		String C = "Example";
		solution(S, C);
	}

	/**
	 * 1. S 문자를 split으로 나눈다
	 * 2. 이름이 중간이름이 있는지 체크한다.
	 * 3. 중간이름이 있으면 제외하고 검증한다.
	 * 4. 이름에 하이픈이 있으면 제외한다
	 * 5. 동일한 이름이 있으면 숫자를 하나씩 증가해서 붙여준다
	 *
	 * @param S 문자열
	 * @param C 회사
	 * @return 값 출력
	 */

	public static String solution(String S, String C) {
		String[] strings = S.split(", ");
		Map<String, Integer> map = new HashMap<>();
		StringBuilder result = new StringBuilder();
		for (String string : strings) {
			String[] str = string.split(" ");
			String firstName = null;
			String lastName = null;
			if (str.length == 2) {
				firstName = str[0].toLowerCase();
				lastName = str[1].replaceAll("-", "").toLowerCase();
			}
			if (str.length == 3) {
				firstName = str[0].toLowerCase();
				lastName = str[2].replaceAll("-", "").toLowerCase();
			}

			String email = firstName + "." + lastName;

			Integer count = map.putIfAbsent(email, 1);
			if (count != null) {
				count = count + 1;
				map.put(email, count);
				email = email + count;
			}

			String name = Arrays.stream(str).collect(Collectors.joining(" "));
			result.append(name)
					.append(" <")
					.append(email)
					.append("@")
					.append(C.toLowerCase())
					.append(".com")
					.append(">, ");
		}
		result = new StringBuilder(result.toString().trim().substring(0, result.length() - 2));
		return result.toString();
	}

}
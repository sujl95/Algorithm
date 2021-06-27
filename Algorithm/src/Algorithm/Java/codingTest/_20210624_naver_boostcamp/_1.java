package Algorithm.Java.codingTest._20210624_naver_boostcamp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1 {

	public static void main(String[] args) {
		String[] param0 = {"/a/a_v2.x", "/b/a.x", "/c/t.z", "/d/a/t.x", "/e/z/t_v1.z", "/k/k/k/a_v9.x"};
		// String[] param0 = {"/t.z", "/b/b.z", "/a.z", "/e/k.z", "/d/a/x_v2.z"};
		System.out.println(Arrays.toString(solution(param0)));
	}

	public static String[] solution(String[] param0) {
		Map<String, Integer> map = new HashMap<>();
		StringBuilder answer = new StringBuilder();
		for (String s : param0) {
			String[] str = s.split("/");
			String[] file = str[str.length - 1].split("\\.");
			char startName = file[0].charAt(0);
			String endName = file[1];
			String fullName = startName + "." + endName;
			map.merge(fullName, 1, Integer::sum);
		}
		Object[] mapkey = map.keySet().toArray();
		Arrays.sort(mapkey);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				answer.append(entry.getKey()).append(" ").append(entry.getValue()).append(" ");
			}
		}
		return answer.toString().equals("") ? new String[0] : answer.toString().trim().split(" ");
	}

}

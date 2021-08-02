package Algorithm.Java.programmers.level2._2019kakaoblind;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class P42888_오픈채팅방 {

	public static void main(String[] args) {
		String[] record = new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
				"Enter uid1234 Prodo", "Change uid4567 Ryan"};
		System.out.println("solution() = " + Arrays.toString(solution(record)));
	}

	public static String[] solution(String[] records) {
		Map<String, String> map = new HashMap<>();
		List<String> answers = new LinkedList<>();
		for (String s : records) {
			String[] record = s.split(" ");
			if (record.length == 3) {
				map.put(record[1], record[2]);
			}
		}
		Arrays.stream(records)
				.map(s -> s.split(" "))
				.filter(record -> !record[0].equals("Change"))
				.forEach(record -> answers.add(
						map.get(record[1]) + (record[0].equals("Enter") ? "님이 들어왔습니다." : "님이 나갔습니다.")));
		return answers.toArray(String[]::new);
	}

}
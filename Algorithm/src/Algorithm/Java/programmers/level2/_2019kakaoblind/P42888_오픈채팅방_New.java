package Algorithm.Java.programmers.level2._2019kakaoblind;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P42888_오픈채팅방_New {

	public static void main(String[] args) {
		String[] record = new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
				"Enter uid1234 Prodo", "Change uid4567 Ryan"};
		System.out.println("solution() = " + Arrays.toString(solution(record)));
	}

	public static String[] solution(String[] records) {
		Map<String, String> map = Arrays.stream(records)
				.map(s -> s.split(" "))
				.filter(record -> record.length == 3)
				.collect(Collectors.toMap(record -> record[1], record -> record[2], (a, b) -> b));
		List<String> answers = Arrays.stream(records)
				.map(s -> s.split(" "))
				.filter(record -> !record[0].equals("Change"))
				.map(record -> map.get(record[1]) + (record[0].equals("Enter") ? "님이 들어왔습니다." : "님이 나갔습니다."))
				.collect(Collectors.toCollection(LinkedList::new));
		return answers.toArray(String[]::new);
	}

}
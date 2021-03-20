package Algorithm.Java.codingTest._20210320_LINE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class _1 {
	public static void main(String[] args) {
		String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA"};
		String[] languages = {"PYTHON", "C++", "SQL"};
		int[] preference = {7, 5, 5};
		System.out.println("solution() = " + solution(table, languages, preference));
	}

	public static String solution(String[] table, String[] languages, int[] preference) {
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String item : table) {
			String[] t = item.split(" ");
			String s = t[0];
			map.put(s, 0);
			for (int j = 1; j < 6; j++) {
				for (int k = 0; k < languages.length; k++) {
					if (t[j].equals(languages[k])) {
						Integer value = map.get(s);
						map.put(s, value + (preference[k] * (6 - j)));
					}
				}
			}
		}
		LinkedHashMap<String, Integer> result = sortMapByValue(map);
		List<String> keyList = new ArrayList<>(result.keySet());
		List<Integer> valueList = new ArrayList<>(result.values());
		int temp = 0;
		List<String> answerList = new ArrayList<>();
		for (int i = valueList.size() - 1; i >= 0; i--) {
			if (valueList.get(i) >= temp) {
				temp = valueList.get(i);
				answerList.add(keyList.get(i));
			}
		}
		Collections.sort(answerList);
		return answerList.get(0);
	}




	public static LinkedHashMap<String, Integer> sortMapByValue(Map<String, Integer> map) {
		List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
		entries.sort(Map.Entry.comparingByValue());

		LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : entries) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
}

package Algorithm.Java.etc;

import java.util.Map;
import java.util.TreeMap;

public class 문자열압축 {

	public static void main(String[] args) {
		String input = "aaaabbcsaa";
		Map<Character, Integer> map = new TreeMap<>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			map.merge(c, 1, Integer::sum);
		}
		String res = "";
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			res += String.valueOf(entry.getKey()) + entry.getValue();
		}
		System.out.println(res.length() > input.length() ? input : res);
	}
}

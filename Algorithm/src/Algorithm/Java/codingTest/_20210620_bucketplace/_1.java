package Algorithm.Java.codingTest._20210620_bucketplace;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Map<String, Integer> map = new HashMap<>();
		StringBuilder str = new StringBuilder();
		String temp = "";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			temp = c + "";
			String num = "";
			for (int j = i + 1; j < input.length(); j++) {
				char c1 = input.charAt(j);
				if (Character.isDigit(c1)) {
					num += c1;
					i = j;
				} else {
					break;
				}
			}
			Integer alphaNum = map.get(temp);
			if (alphaNum == null) {
				map.put(temp, Integer.parseInt(num));
			} else {
				map.put(temp, alphaNum + Integer.parseInt(num));
			}
			if (!str.toString().contains(temp) && !Character.isDigit(c)) {
				str.append(temp);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			String c = str.charAt(i) + "";
			Integer value = map.get(c);
			result.append(c).append(value);
		}
		System.out.println(result);

	}

}

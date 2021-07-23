package Algorithm.Java.codingTest._20210723_mashkorea._2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> logs = new ArrayList<>();
		List<String> answer = new ArrayList<>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			logs.add(br.readLine());
		}
		int threshold = Integer.parseInt(br.readLine());
		Collections.sort(logs);
		Map<Integer, Integer> map = new HashMap<>();
		for (String log : logs) {
			int[] input = Arrays.stream(log.split(" ")).mapToInt(Integer::parseInt).toArray();
			int sender = input[0];
			int recipient = input[1];
			if (sender == recipient) {
				map.merge(sender, 1, Integer::sum);
				continue;
			}
			map.merge(sender, 1, Integer::sum);
			map.merge(recipient, 1, Integer::sum);
		}
		map.forEach((key, value) -> {
			if (value >= threshold) {
				answer.add(String.valueOf(key));
			}
		});
		answer.sort((o1, o2) -> {
			if (o1.length() == o2.length()) {
				return o1.compareTo(o2);
			}
			return o1.length() - o2.length();
		});
		System.out.println("answer = " + answer);
	}
}

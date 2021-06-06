package Algorithm.Java.backjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class J1764_S4_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = arr[0];
		int M = arr[1];
		Map<String, String> map = new HashMap();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			map.put(input, input);
		}

		for (int i = 0; i < M; i++) {
			String input = br.readLine();
			String getString = map.get(input);
			if (getString != null) {
				list.add(input);
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		list.forEach(System.out::println);
	}
}

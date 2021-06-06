package Algorithm.Java.backjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class J1764_S4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = arr[0];
		int M = arr[1];
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			set.add(input);
		}

		for (int i = 0; i < M; i++) {
			String input = br.readLine();
			if (set.contains(input)) {
				list.add(input);
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		list.forEach(System.out::println);
	}
}

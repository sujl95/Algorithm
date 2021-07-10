package Algorithm.Java.backjun.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class J2751_S5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> answers = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			answers.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(answers);
		StringBuilder sb = new StringBuilder();
		answers.forEach(value -> sb.append(value).append("\n"));
		System.out.println(sb);
	}
}

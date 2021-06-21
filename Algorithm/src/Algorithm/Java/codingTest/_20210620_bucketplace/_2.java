package Algorithm.Java.codingTest._20210620_bucketplace;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < input; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		int sum = list.stream().mapToInt(value -> value).sum();
		System.out.println(sum);
	}

}

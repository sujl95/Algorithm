package Algorithm.Java.backjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class J1427_S5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");
		Arrays.sort(str, Collections.reverseOrder());
		System.out.println(Arrays.stream(str).collect(Collectors.joining()));
	}
}

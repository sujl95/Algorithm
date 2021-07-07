package Algorithm.Java.codingTest._20210707_ZUM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2_New3 {
	public static void main(String[] args) {
		System.out.println(new _2_New3().translate(91));
	}
	public String[] solution(String[] logs) {
		int[][] arr = new int[10000][101];
		for (int[] ints : arr) {
			Arrays.fill(ints, -1);
		}
		boolean[] p = new boolean[10000];
		for (int i = 0; i < logs.length; i++) {
			int[] input = Arrays.stream(logs[i].split(" ")).mapToInt(Integer::parseInt).toArray();
			for (int j = 0; j < input.length; j++) {
				int num = input[0];
				p[num] = true;
				int pNum = input[1];
				int point = input[2];
				arr[num][pNum] = point;
			}
		}

		Set<Integer> set = new HashSet<>();
		while (true) {
			int pVal = find(p);
			if (pVal == -1) {
				break;
			}
			p[pVal] = false;
			for (int j = pVal + 1; j < 10000; j++) {
				if (!p[j]) {
					continue;
				}
				int sum = 0;

				for (int k = 0; k <= 100; k++) {
					if (arr[j][k] == -1) {
						continue;
					}

					if (arr[pVal][k] == arr[j][k] && (arr[j][k]) != -1) {
						sum++;
					}
				}

				if (sum >= 5) {
					set.add(pVal);
					set.add(j);
					p[j] = false;
				}
			}
		}


		List<String> resList = new ArrayList<>();

		for (Integer i : set) {
			resList.add(translate(i));
		}
		resList.sort(String::compareTo);

		if (resList.isEmpty()) {
			resList.add("None");
		}
		return resList.stream().toArray(String[]::new);
	}

	private String translate(int key) {
		StringBuilder sb = new StringBuilder();
		sb.append(key);

		while (sb.length() < 4) {
			sb.insert(0, 0 + "");
		}
		return sb.toString();
	}

	private int find(boolean[] p) {
		for (int i = 1; i < p.length; i++) {
			if (p[i]) {
				return i;
			}
		}
		return -1;
	}

}

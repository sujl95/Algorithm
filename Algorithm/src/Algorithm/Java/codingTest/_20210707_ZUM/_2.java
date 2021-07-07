package Algorithm.Java.codingTest._20210707_ZUM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2 {

	public static void main(String[] args) {
		// String[] logs = {"0001 3 95", "0001 5 90", "0001 5 100", "0002 3 95", "0001 7 80", "0001 8 80", "0001 10 90",
		// 		"0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90"};
		String[] logs = {"1901 1 100", "1901 2 100", "1901 4 100", "1901 7 100", "1901 8 100", "1902 2 100",
				"1902 1 100", "1902 7 100", "1902 4 100", "1902 8 100", "1903 8 100", "1903 7 100", "1903 4 100",
				"1903 2 100", "1903 1 100", "1101 1 95", "1101 2 100", "1101 4 100", "1101 7 100", "1101 9 100",
				"1102 1 95", "1102 2 100", "1102 4 100", "1102 7 100", "1102 9 100"};

		// String[] logs = {"0101 1 100", "0101 2 100", "0101 4 100", "0101 7 100", "0101 8 100", "0101 9 100", "1902 2 100",
		// 		"1902 1 100", "1902 7 100", "1902 4 100", "1902 8 100", "1903 8 100", "1903 7 100", "1903 4 100",
		// 		"1903 2 100", "1903 1 100", "1101 1 95", "1101 2 100", "1101 4 100", "1101 7 100", "1101 9 100",
		// 		"1102 1 95", "1102 2 100", "1102 4 100", "1102 7 100", "1102 9 100"};

		// String[] logs = {"1901 10 50", "1909 10 50"};
		System.out.println(Arrays.toString(solution(logs)));
	}

	public static String[] solution(String[] logs) {
		int[][] arr = new int[logs.length][3];
		for (int i = 0; i < logs.length; i++) {
			arr[i] = Arrays.stream(logs[i].split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		int num = arr[0][0];
		int pNum = arr[0][1];
		int[][] tempArr = new int[arr.length][3];
		int pos = 1;
		tempArr[0][0] = num;
		tempArr[0][1] = pNum;
		tempArr[0][2] = arr[0][2];
		for (int i = 1; i < arr.length; i++) {
			int nowNum = arr[i][0];
			int nowPNum = arr[i][1];
			int nowPoint = arr[i][2];
			if (num == nowNum && pNum == nowPNum) {
				tempArr[pos - 1][0] = nowNum;
				tempArr[pos - 1][1] = nowPNum;
				tempArr[pos - 1][2] = nowPoint;
				continue;
			} else {
				num = nowNum;
				pNum = nowPNum;
				tempArr[pos][0] = nowNum;
				tempArr[pos][1] = nowPNum;
				tempArr[pos][2] = nowPoint;
				pos++;
			}
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < tempArr.length; i++) {
			int nowNum = tempArr[i][0];
			int nowPNum = tempArr[i][1];
			int nowPoint = tempArr[i][2];
			for (int j = 0; j < tempArr.length; j++) {
				if (i == j) {
					continue;
				}
				int nextNum = tempArr[j][0];
				int nextPNum = tempArr[j][1];
				int nextPoint = tempArr[j][2];

				if (nextNum != nowNum && nextPoint == nowPoint && nowPNum == nextPNum) {
					map.merge(nowNum, 1, Integer::sum);
					break;
				}
			}
		}
		// List<String> ansList = new ArrayList<>();
		// System.out.println("map = " + map);
		// for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		// 	if (entry.getValue() > 4) {
		// 		String key = String.valueOf(entry.getKey());
		// 		int length = key.length();
		// 		if (length < 4) {
		// 			while (key.length() < 4) {
		// 				key = "0" + key;
		// 			}
		// 		}
		// 		ansList.add(key);
		// 	}
		// }
		// if (ansList.size() == 0) {
		// 	ansList.add("None");
		// }
		// return ansList.stream().sorted().map(String::valueOf).toArray(String[]::new);

		int idx = 0;
		int[][] ans = new int[map.size()][2];
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 4) {
				ans[idx][0] = entry.getKey();
				ans[idx][1] = entry.getValue();
				idx++;
			}
		}

		List<String> ansList = new ArrayList<>();
		for (int i = 0; i < ans.length; i++) {
			int key = ans[i][0];
			int value = ans[i][1];
			boolean ck = false;
			for (int j = 0; j < ans.length; j++) {
				if (i == j) {
					continue;
				}

				int nextKey = ans[j][0];
				int nextValue = ans[j][1];


				if (value == nextValue && value > 4) {
					ck = true;
					break;
				}
			}

			if (ck) {
				String strKey = String.valueOf(key);
				int length = strKey.length();
				if (length < 4) {
					while (strKey.length() < 4) {
						strKey = "0" + strKey;
					}
				}
				ansList.add(strKey);

			}
			if (ansList.size() == 0) {
				ansList.add("None");
			}
		}

		return ansList.stream().sorted().map(String::valueOf).toArray(String[]::new);
	}

}

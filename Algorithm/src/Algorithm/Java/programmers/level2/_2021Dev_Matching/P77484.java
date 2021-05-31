package Algorithm.Java.programmers.level2._2021Dev_Matching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P77484 {

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] lottos1 = {0, 0, 0, 0, 0, 0};
		int[] lottos2 = {45, 4, 35, 20, 3, 9};
		int[] lottos3 = {1, 2, 3, 4, 5, 6};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int[] win_nums1 = {38, 19, 20, 40, 15, 25};
		int[] win_nums2 = {20, 9, 3, 45, 4, 35};
		int[] win_nums3 = {7, 8, 9, 10, 11, 12};
		System.out.println(Arrays.toString(solution(lottos3, win_nums3)));
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 6);
		map.put(2, 5);
		map.put(3, 4);
		map.put(4, 3);
		map.put(5, 2);
		map.put(6, 1);
		Arrays.sort(lottos);
		Arrays.sort(win_nums);
		if (Arrays.equals(lottos, win_nums)) {
			return new int[]{1, 1};
		}
		if (Arrays.equals(lottos, new int[] {0, 0, 0, 0, 0, 0})) {
			return new int[] {1, 6};
		}
		int minCount = 0;
		for (int i = 0; i < 6; i++) {
			int lotto = lottos[i];
			if (lotto == 0) {
				continue;
			}
			for (int j = 0; j < 6; j++) {
				int win_num = win_nums[j];
				if (lotto == win_num) {
					minCount++;
					lottos[i] = win_nums[j] = -1;
				}
			}
		}
		int lottoCount = (int) Arrays.stream(lottos)
				.filter(i -> i == 0)
				.count();
		int winNumCount = (int) Arrays.stream(win_nums)
				.filter(i -> i != -1)
				.count();
		int maxCount = 0;
		if (winNumCount >= lottoCount) {
			maxCount = minCount + lottoCount;
		}
		if (maxCount == 0 && minCount == 0) {
			return new int[] {6, 6};
		}
		maxCount = map.get(maxCount);
		minCount = map.get(minCount);
		return new int[] {maxCount, minCount};
	}
}

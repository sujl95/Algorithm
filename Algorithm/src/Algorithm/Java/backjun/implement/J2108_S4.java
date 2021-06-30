package Algorithm.Java.backjun.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class J2108_S4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[][] countArr = new int[8001][2];
		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(br.readLine());
			arr[i] = value;
			countArr[value + 4000][0] = value;
			countArr[value + 4000][1]++;
		}
		Arrays.sort(arr);
		Arrays.sort(countArr, (o1, o2) -> o2[1] - o1[1]);
		List<int[]> list = Arrays.stream(countArr).filter(countArrays -> countArrays[1] != 0)
				.collect(Collectors.toList());
		int mode = list.get(0)[1];
		int modeRes;
		if (list.size() > 1) {
			int modeNext = list.get(1)[1];
			if (mode == modeNext) {
				modeRes = list.get(1)[0];
			} else {
				modeRes = list.get(0)[0];
			}
		} else {
			modeRes = list.get(0)[0];
		}
		long avg = Math.round(Arrays.stream(arr).average().getAsDouble());
		int mid = arr[arr.length / 2];
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(avg);
		System.out.println(mid);
		System.out.println(modeRes);
		System.out.println(max - min);
	}

}

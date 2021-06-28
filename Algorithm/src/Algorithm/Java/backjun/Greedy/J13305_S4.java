package Algorithm.Java.backjun.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J13305_S4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		long[] distance = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		long[] gasStation = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

		//다음거랑 비교를 해서 높은지 체크
		long res = 0;
		long min = gasStation[0];
		for (int i = 0; i < gasStation.length - 1; i++) {
			long gas = gasStation[i];
			// 현재 주유소가 이전 주유소보다 기름값보다 쌀 경우 min 리셋
			if (gas < min) {
				min = gas;
			}
			res += distance[i] * min;
		}
		System.out.println(res);
	}
}

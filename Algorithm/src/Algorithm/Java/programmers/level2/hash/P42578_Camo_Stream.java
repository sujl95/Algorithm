package Algorithm.Java.programmers.level2.hash;

import static java.util.stream.Collectors.*;

import java.util.Arrays;

public class P42578_Camo_Stream {
	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(clothes));
	}

	public static int solution(String[][] clothes) {
		return Arrays.stream(clothes)
				.collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
				.values()
				.stream()
				.reduce(1L, (x, y) -> x * (y + 1))
				.intValue() - 1;
				// key를 버리고 value만 뽑아낸다 -> List로 나온다
				// List를 Stream
				// reduce 모은다 1L = 초기값,  x = 1L, y = counting value (1 * (y + 1))
				// int로 변환 후 - 1
	}
}

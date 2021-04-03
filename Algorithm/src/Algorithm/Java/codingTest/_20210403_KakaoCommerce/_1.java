package Algorithm.Java.codingTest._20210403_KakaoCommerce;

import java.util.Arrays;

public class _1 {
	public static void main(String[] args) {
		int[] gift_cards = {4, 5, 3, 2, 1};
		int[] wants = {2, 4, 4, 5, 1};
		System.out.println(solution(gift_cards, wants));
	}

	public static int solution(int[] gift_cards, int[] wants) {
		for (int i = 0; i < gift_cards.length; i++) {
			for (int j = 0; j < wants.length; j++) {
				int want = wants[i];
				if (gift_cards[j] == want ) {
					wants[i] = gift_cards[j] = -1;
				}
			}
		}
		return (int) Arrays.stream(wants).filter(want -> want != -1).count();
	}
}

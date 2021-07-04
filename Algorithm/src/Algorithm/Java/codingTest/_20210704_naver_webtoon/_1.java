package Algorithm.Java.codingTest._20210704_naver_webtoon;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;

public class _1 {

	public static void main(String[] args) {

		System.out.println(solution(new int[] {13000, 88000, 10000}, new int[] {30, 20}));
	}


	public static int solution(int[] prices, int[] discounts) {
		Integer[] pricesI = Arrays.stream(prices).boxed().toArray(Integer[]::new);
		Integer[] discountsI = Arrays.stream(discounts).boxed().toArray(Integer[]::new);
		Arrays.sort(pricesI, Collections.reverseOrder());
		Arrays.sort(discountsI, Collections.reverseOrder());
		int[] sortPrices = Arrays.stream(pricesI).mapToInt(Integer::intValue).toArray();
		int[] sortDiscounts = Arrays.stream(discountsI).mapToInt(Integer::intValue).toArray();

		for (int i = 0; i < sortDiscounts.length; i++) {
			double div = Double.parseDouble("0." + (100 - sortDiscounts[i]));
			BigDecimal bigDecimal1 = new BigDecimal(sortPrices[i]);
			BigDecimal bigDecimal2 = new BigDecimal(div);
			BigDecimal multiply = bigDecimal1.multiply(bigDecimal2).setScale(0, RoundingMode.HALF_UP);
			sortPrices[i] = multiply.intValue();
		}
		return Arrays.stream(sortPrices).sum();
	}

}

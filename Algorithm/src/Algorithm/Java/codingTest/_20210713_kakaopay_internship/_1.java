package Algorithm.Java.codingTest._20210713_kakaopay_internship;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class _1 {

	public static void main(String[] args) {

		System.out.println(
				"solution(12345678, 10, 20, 250000, 10000000, 4, 9000014) = " + solution(12345678, 10, 20, 250000,
						10000000, 4));
		System.out.println(
				"solution(1000000000, 50, 99, 100000, 0, 6, 6150) = " + solution(1000000000, 50, 99, 100000, 0, 6));
		System.out.println("solution(123456789, 0, 0, 1, 0, 360) = " + solution(123456789, 0, 0, 1, 0, 360));

	}

	/**
	 *	threshold 미만은 0
	 *
	 * @param money : 초기 소유 금액
	 * @param minratio : 최소 세율
	 * @param maxratio : 최대 세율
	 * @param ranksize : 세율 크기
	 * @param threshold
	 * @param months : 월차
	 * @return
	 */
	private static int solution(int money, int minratio, int maxratio, int ranksize, int threshold, int months) {

		if (minratio == maxratio) {
			return money;
		}
		int i = 0;
		boolean ck;
		boolean end;
		int minThreshold;
		int maxThreshold;
		int idx;
		int ratio;
		while (i < months) {
			int j = minratio;
			idx = 0;
			ratio = 0;
			ck = false;
			end = false;
			int floorMoney = new BigDecimal(String.valueOf(money)).setScale(-2, RoundingMode.FLOOR).intValue();
			while (j < maxratio) {

				minThreshold = threshold + (ranksize * idx);
				maxThreshold = threshold + (ranksize * (idx + 1));



				if (money == minThreshold) {
					ck = true;
					break;
				}

				if (minThreshold <= floorMoney && floorMoney < maxThreshold) {
					ck = true;
					break;
				}

				if (money < threshold) {
					end = true;
					break;
				}

				idx++;
				j++;

			}
			if (end) {
				i++;
				continue;
			}

			if (ck) {
				ratio += idx + minratio;
				money -= new BigDecimal("0." + ratio).multiply(BigDecimal.valueOf(floorMoney)).setScale(0).intValue();
			} else {
				money -= new BigDecimal("0." + maxratio).multiply(BigDecimal.valueOf(floorMoney)).setScale(0).intValue();
			}
			i++;
		}

		return money;

	}

}

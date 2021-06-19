package Algorithm.Java.codingTest._20210619_YogiYo;

import java.time.LocalDate;

public class _2 {

	public static void main(String[] args) {
		String S = " 779091968 23 Sep 2009 system.zip\n 284164096 14 Aug 2013 to-do-list.xml\n 714080256 19 Jun 2013 blockbuster.mpeg\n       329 12 Dec 2010 notes.html\n 444596224 17 Jan 1950 delete-this.zip\n       641 24 May 1987 setup.png\n    245760 16 Jul 2005 archive.zip\n 839909376 31 Jan 1990 library.dll";
		System.out.println(solution(S));
	}

	/**
	 * 1. \n으로 split
	 * 2. 자른걸 크기 먼저 비교 후 통과하면 날짜 비교 후 count
	 *
	 * @param S
	 * @return
	 */

	public static String solution(String S) {
		String[] strings = S.split("\n");
		int result = 0;

		String[] months = {"Jan", "Feb", "Mar", "May", "Apr", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		LocalDate targetDate = LocalDate.of(1990, 1, 31);
		for (String string : strings) {
			String[] str = string.trim().split(" ");
			int fileSize = Integer.parseInt(str[0].trim());

			if (fileSize < 245_760) {
				continue;
			}

			int date = Integer.parseInt(str[1]);
			String strMonth = str[2];
			int month = 0;
			for (int i = 0; i < months.length; i++) {
				if (strMonth.equals(months[i])) {
					month = i + 1;
				}
			}
			int year = Integer.parseInt(str[3]);

			LocalDate strDate = LocalDate.of(year, month, date);
			if (!strDate.isAfter(targetDate)) {
				continue;
			}
			result++;
		}
		return "" + result;
	}

}

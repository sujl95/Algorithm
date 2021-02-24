package Algorithm.Java.leetCode;

import java.util.Arrays;

public class _5LongestPalindromicSubString_2 {

	public static void main(String[] args) {
		 
		System.out.println(longestPalindrome("bdbcbbbbb"));
	}
	
	
	public static String longestPalindrome(String s) {
        String ret = "";
        char[] chr = s.toCharArray();
        boolean[][] dp = new boolean[chr.length][chr.length];
        int maxN = 0;
		for (int i = chr.length - 1; i >= 0; i--) {
			for (int j = i; j < chr.length; j++) {
				dp[i][j] = (chr[i] == chr[j] && (j - i <= 2 || dp[i + 1][j - 1]));
				System.out.println(dp[i][j]);
				if (dp[i][j] && j - i >= maxN) {
					maxN = j - i;
					ret = s.substring(i, j + 1);
				}
				for (int k = 0; k < dp[i].length; k++) {
					System.out.println(Arrays.toString(dp[k]));
				}
			}
		}
        return ret;
    }


}

package Algorism.Java.leetCode;

import java.util.Arrays;

public class _5LongestPalindromicSubString_1 {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("abbb"));
	}
	
	public static String longestPalindrome(String s) {
		if( s==null || "".equals(s)) return s;
		int len = s.length();
		String ans = "";
		int max = 0;
		boolean[][] dp = new boolean[len][len];
		for(int j= 0; j < len; j++) {
			for(int i = 0; i <=j; i++) {
				boolean judge = s.charAt(i) == s.charAt(j);
				dp[i][j] = j - i > 2 ? dp[i+1][j-1] && judge : judge;
				System.out.println(dp[i][j]);
				if(dp[i][j] && j - i +1 > max) {
					max = j - i +1;
					ans = s.substring(i , j+1);
				}
			}
		}
		for(int i = 0; i< dp.length;i++) {
			System.out.println(Arrays.toString(dp[i]));
			
		}
		return ans;
	}

}

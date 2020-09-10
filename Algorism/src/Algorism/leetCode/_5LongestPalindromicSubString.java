package Algorism.leetCode;

public class _5LongestPalindromicSubString {

	public static void main(String[] args) {
		System.out.println(solution("abacab"));
	}
	
	public static String solution(String s) {
		if(s==null || s.length() == 0) return "";
		if(s.equals(reverse(s))) return s;
		int cnt = 2;
		String[] arr = {"","0"};
		for(int i = 0; i< s.length();i++) {
			for(int j = i; j<s.length();j++) {
				if(s.length() < i+cnt) break;
				String cut = s.substring(i,i+cnt);
				if(cut.equals(reverse(cut))) {
					if(Integer.parseInt(arr[1]) < cut.length()) {
						arr[0] = cut;
						arr[1] = arr[0].length()+"";
					}
				}
				cnt++;
			}
			cnt = 2;
		}
		if(arr[0].equals("")) return s.substring(0,1);
		else return arr[0];
	}
	
	public static String reverse(String s) {
		return new StringBuffer(s).reverse().toString();
	}


}

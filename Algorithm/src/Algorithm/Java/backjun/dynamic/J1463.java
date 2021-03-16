package Algorithm.Java.backjun.dynamic;

public class J1463 {
	static int[] memo = new int [1001];
	static int func(int n ) {
		if(memo[n] != 0)  return memo[n];
		int min = 9999999;
		if (n % 2 ==0) {
			min = Math.min(min, func(n/2));
			
		}
		if(n % 3==0) {
			min = Math.min(min, func(n/3));
		}
		min = Math.min(min, func(n-1));
		memo[n] = min +1;
		return memo[n];
	}
	public static void main(String[] args) {
		memo[2] = 1; memo[3] = 1;
		System.out.println(func(1000));
	}

}

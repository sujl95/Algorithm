package Algorithm.Java.backjun.dynamic;
public class J9461 {
	static long[] memo;
	//Top -Down 방식
	static long func(int n) { // 4
		if(memo[n] != 0) return memo[n];
		if(n == 1) return 1;
		if(n == 2) return 1;
		if(n == 3) return 1;
		return memo[n] = func(n-2)  + func(n-3);
	}
	
	//Bottom- Up방식
	static long func1(int n) {
		long a = 1, b = 1, c = 1;
		for ( int i = 4; i <= n ; i++ ) {
			long temp = a+b;
			a = b;
			b = c;
			c = temp;
		}
		return c;
				
	}
	public static void main(String[] args) {
		memo = new long[101];
		System.out.println(func(100));
			System.out.println(func1(100));
		
	}

}

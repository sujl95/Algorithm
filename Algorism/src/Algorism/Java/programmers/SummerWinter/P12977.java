package Algorism.Java.programmers.SummerWinter;

public class P12977 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,7,6,4}));
	}

	public static int solution(int[] nums) {
		int n = nums.length;
		int cnt = 0;
		for (int i = 0; i < n-2; i++) {
			for (int j = i + 1; j < n-1; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					int sqrt = (int) Math.sqrt(sum);
					while(sqrt > 1) {
						if (sum % sqrt == 0) {
							break;
						}
						sqrt--;
					}
					if (sqrt == 1) {
						cnt++;
					}
				}
			}
		}
		return cnt;
	}
}

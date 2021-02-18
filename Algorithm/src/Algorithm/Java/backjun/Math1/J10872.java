package Algorithm.Java.backjun.Math1;
import java.util.*;

public class J10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 1;
		for (int i = 2; i <= N; i++) {
			result *= i;
		}
		System.out.println(result);
	}
}

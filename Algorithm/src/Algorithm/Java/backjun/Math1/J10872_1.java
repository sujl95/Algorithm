package Algorithm.Java.backjun.Math1;
import java.util.*;
public class J10872_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(factorial(i));
	}
	static int factorial(int i) {
		  if(i <= 1) return 1;
	      return i * factorial(i - 1);
	}
}

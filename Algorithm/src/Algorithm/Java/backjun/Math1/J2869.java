package Algorithm.Java.backjun.math1;
import java.util.*;
public class J2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double v = sc.nextInt();
		double result = ((v-a)/(a-b))+1 ;
		System.out.println((int)Math.ceil(result));
	}

}

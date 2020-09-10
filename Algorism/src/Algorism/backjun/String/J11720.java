package Algorism.backjun.String;
import java.util.*;
import java.util.stream.Stream;
public class J11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 int sum = 0;
		 String str1 = sc.next();
		 int[] digits = Stream.of(String.valueOf(str1).split("")).mapToInt(Integer::parseInt).toArray();

		 for (int i = 0; i < digits.length; i++) {
			 sum += digits[i]; 
		 }
		 
		 System.out.println(sum);
	}

}

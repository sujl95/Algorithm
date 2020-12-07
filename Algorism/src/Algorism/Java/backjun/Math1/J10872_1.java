package Math1;
import java.util.*;
public class J10872_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
			
		System.out.println(pactorial(i));
	}
	static int pactorial (int i) {
		  if(i <= 1) return 1;
	     
	      return i * pactorial(i - 1);
	}
}

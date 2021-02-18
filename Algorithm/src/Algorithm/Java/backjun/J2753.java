import java.util.*;
public class J2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		if (1 <= A && A <= 4000) {
			if ( A % 4 == 0) {
				if ( A % 400 == 0) {
					System.out.println("1");
				}
				else if (A % 100 == 0)
				{
					System.out.println("0");
				}
				else 
					System.out.println("1");
			}
			else if ( A % 4 != 0) {
			System.out.println("0");
			}
		}
		
	}

}

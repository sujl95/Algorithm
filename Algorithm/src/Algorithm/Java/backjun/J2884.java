import java.util.*;
public class J2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if ((0 <= H && H <= 23) && (0 <= M && M <= 59)) {
			if (45 <= M && M <= 59) {
				M -= 45;
				System.out.println(H + " " + M);
			}
			else if ( H == 0 && (0 <= M && M <= 44))
			{
				H = 23;
				M += 15;
				System.out.println(H + " " + M);
			}
			else if (( H > 0 && H <= 23) && (0 <= M && M <= 44))
			{
				H -= 1;
				M += 15;
				System.out.println(H + " " + M);
			}
				
		}
	}

}

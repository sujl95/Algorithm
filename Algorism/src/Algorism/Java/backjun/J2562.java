import java.util.*;
public class J2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[9];
		int i = 0;
		int max = 0;
		int result = 0;
		for (i =0 ; i < 9 ; i++)
		{
			int A = sc.nextInt();
			if ( A < 100 ) 
			{
			arr[i] = A;
			if (max < arr[i]) {
				max = arr[i];
				result = i+1; 
			}
			}
		
		}
		
		System.out.println(max);
		System.out.print(result);
	}

}

package Algorism.backjun.Array;
import java.util.*;
public class J2920 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				int arr[] = new int[8];
				
				int asc[] = {1,2,3,4,5,6,7,8};
				int desc[] = {8,7,6,5,4,3,2,1};
				for (int i = 0; i <= 7; i++) {
					arr[i] = sc.nextInt();	
				}
				if (Arrays.toString(arr).equals(Arrays.toString(asc))  ) {
					System.out.println("ascending");	
				}
				else if ( Arrays.toString(arr).equals(Arrays.toString(desc))  ) {
					System.out.println("descending");	
				}
				else
				System.out.println("mixed");	
				
	}

}

package Algorism.backjun.Array;
import java.util.*;
public class J1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double M = 0;
		int arr[] = new int[N] ;
		double SUM = 0;
		double arr1[] = new double[N];
		
		if (0< N &&N <= 1000) {
			
			for (int i =0; i < N; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] > M) {
					M  = arr[i];
					
				}
			}
			for (int i =0; i< N ; i++) {
				arr1[i] = arr[i]/M * 100;
				SUM += arr1[i];	
				
			}
			
			SUM /= N; 
		}
		System.out.println(Math.round(SUM*1000000)/1000000.0);
	}

}

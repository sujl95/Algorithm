package Algorism.backjun.Array;
import java.util.*;
public class J4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int k=0 ; k< T; ++k) {
			int N = sc.nextInt();
			int arr[] = new int[N];
			int sum =0;
			double avg =0;
			for (int i =0; i< arr.length; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i]; 
			}
			avg = sum/N;
			int cnt =0;
			for (int j =0; j<arr.length; j++ ) {
				if (arr[j] > avg) {
					cnt++;
				}
				
			}
			double result = 0;
//			result = (double)cnt/ (double)arr.length * 100.0;
//			System.out.println(Math.round(result *1000)/1000.0 +"%");
			System.out.printf("%.3f",100.0* cnt / arr.length);
			System.out.println("%");
			
			
		}
		sc.close();

	}

}

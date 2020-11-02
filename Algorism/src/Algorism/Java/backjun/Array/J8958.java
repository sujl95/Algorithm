package Algorism.Java.backjun.Array;
import java.util.*;
public class J8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] arr = new String[N];
		int result[] = new int[N];
		char O ='O';
		for(int i =0; i< N ; i++) {
			arr[i]  = sc.next();
			String[] arr1;
			arr1= arr[i].split("");
//			System.out.println(Arrays.toString(arr1));
			
			int Ocnt = 0;
			int Osum =0;
			
			for(int j = 0; j < arr1.length; j++) {
				 
				if(arr1[j].equals("O") == true) {
					if(arr1[j].equals("O")) {
						
						
						Osum += ++Ocnt;
					}
					
				}
				else Ocnt =0;
			}
			System.out.println(Osum);
		}
		
		sc.close();
		
	}

}

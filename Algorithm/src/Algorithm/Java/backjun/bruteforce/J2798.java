package Algorithm.Java.backjun.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J2798 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader( 
				new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine().split(" ")[1]);
		int[] arr = Arrays.stream(br.readLine().split(" ")).
				mapToInt(s -> Integer.parseInt(s)).toArray();
		
		int max = 0;
		for( int i =0; i < arr.length - 2 ; i++) {
			for(int j =i+1 ; j <arr.length; j++) {
				for (int k = j+1; k< arr.length; k++) {
					int val = arr[i] + arr[j] + arr[k];
					if(val <= m) max = Math.max(max, val);
				}
			}
		}
		System.out.println(max);
		
	}

}

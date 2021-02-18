package Algorithm.Java.backjun.String;
import java.util.*;
public class J10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int arr1[] = new int[26];
		int arr2[] = new int[26];
		 
		Arrays.fill(arr1, -1);
		for(byte b : input.getBytes()) { //[b][a][e][k][j][o][o][n]
			arr1[b - 'a'] = input.indexOf((char)b + "");
			
		}
		for(int i : arr1)System.out.print(i + " " );

	}

}

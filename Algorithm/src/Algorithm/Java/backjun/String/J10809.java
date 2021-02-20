package Algorithm.Java.backjun.String;
import java.util.*;
public class J10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int[] arr = new int[26];

		Arrays.fill(arr, -1);
		for (byte b : input.getBytes()) { //[b][a][e][k][j][o][o][n]
			arr[b - 'a'] = input.indexOf((char)b + "");
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}

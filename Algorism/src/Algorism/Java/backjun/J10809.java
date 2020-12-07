import java.util.*;
public class J10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int arr1[] = new int[26];
		
		//01234567
		//baekjoon
		Arrays.fill(arr1, -1);
		for(byte b : input.getBytes()) { //[b][a][e][k][j][o][o][n]
			arr1[b - 'a'] = input.indexOf((char)b + "");
			
		}
		
		for(int i = 0 ; i < input.getBytes().length ; i++) {
			byte b = input.getBytes()[i];
			arr1[b - 'a'] = input.indexOf((char)b + "");
		}
		
		for(int i : arr1)System.out.print(i + " " );
		
	}

}
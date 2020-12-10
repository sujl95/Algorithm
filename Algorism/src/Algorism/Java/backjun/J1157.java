import java.util.*;
public class J1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str1 = sc.next();
		//String arr[] = new String[str.length()];
		String arr[] = str.split("");
		String result = "";
		String arr1[] = str1.split("");
		String result1 = "";
		int result2 = 0;
		
		for (int i = arr.length-1; i>= 0 ; i-- ) {
			result += arr[i];
		}
		
		for (int i = arr1.length-1; i>= 0 ; i-- ) {
			result1 += arr1[i];
		}
		
		if (Integer.parseInt(result) > Integer.parseInt(result1)) {
			result2 = Integer.parseInt(result);
		}
		else if (Integer.parseInt(result) < Integer.parseInt(result1)) {
			result2 = Integer.parseInt(result1);
		}	
		System.out.println(result2);
		
	}

}

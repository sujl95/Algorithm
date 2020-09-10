package Algorism.backjun.String;
import java.util.*;
public class J2675 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		 
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int cnt = sc.nextInt();
            String str = sc.nextLine();
 
            String result = "";
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < cnt; k++)
                    result += str.charAt(j);
            }
            result = result.replaceAll(" ", "");
            System.out.println(result);
        }
        sc.close();
	}

}

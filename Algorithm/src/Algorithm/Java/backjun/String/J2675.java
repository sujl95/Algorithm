package Algorithm.Java.backjun.string;
import java.util.*;
public class J2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int cnt = sc.nextInt();
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < cnt; k++)
                    sb.append(str.charAt(j));
            }
            sb = new StringBuilder(sb.toString().replaceAll(" ", ""));
            System.out.println(sb);
        }
        sc.close();
	}

}

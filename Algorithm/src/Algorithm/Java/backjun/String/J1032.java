package Algorithm.Java.backjun.String;

import java.util.*;

public class J1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[n];
        boolean ck = true;
        for (int i = 0; i < n; i++)
            arr[i] = sc.next();
        for (int i = 0; i < arr[0].length(); i++) {
            for (int j = 1; j < n; j++) {
                if (arr[0].charAt(i) == arr[j].charAt(i)) {
                    ck = true;
                } else {
                    ck = false;
                    break;
                }
            }
            if (ck)
                sb.append(arr[0].charAt(i));
            else
                sb.append("?");
        }
        System.out.println(sb);
    }
}

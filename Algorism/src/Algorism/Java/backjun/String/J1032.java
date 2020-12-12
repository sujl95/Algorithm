package Algorism.Java.backjun.String;

import java.util.*;

public class J1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        String[] a = new String[n];
        boolean ck = true;
        for (int i = 0; i < n; i++)
            a[i] = sc.next();
        for (int i = 0; i< a[0].length(); i++) {
            for (int j = 1; j < n; j++) {
                if (a[0].charAt(i) == a[j].charAt(i)) {
                    ck = true;
                } else {
                    ck = false;
                    break;
                }
            }
            if (ck) s += a[0].charAt(i);
            else s += "?";
        }
        System.out.println(s);
    }
}

package Algorithm.Java.backjun.Stack;

import java.util.*;

public class J9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n --> 0) {
            String s = sc.next();
            Stack<Character> stk = new Stack<>();
            boolean ck = true;
            char[] arr = s.toCharArray();
            for(char c : arr) {
                if (c == '(')
                    stk.push(c);
                else {
                    if(!stk.isEmpty())
                        stk.pop();
                    else {
                        ck = false;
                        break;
                    }
                }
            }
            if (!stk.isEmpty()) {
                ck = false;
            }
            System.out.println(ck ? "YES" : "NO");
        }
    }
}

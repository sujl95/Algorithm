package Algorism.Java.backjun.Stack;

import java.util.*;

public class J1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stackI = new Stack<>();
        StringBuffer str = new StringBuffer();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int cnt = 1;
        int idx = 0;
        while (cnt <= n) {
            stackI.push(cnt++);
            str.append("+");
            while (!stackI.isEmpty() && stackI.peek() == arr[idx]) {
                idx++;
                stackI.pop();
                str.append("-");
            }
        }
        if (!stackI.isEmpty()) {
            System.out.println("NO");
        } else {
            for (char c : str.toString().toCharArray()) {
                System.out.println(c);
            }
        }
    }
}

package Algorithm.Java.backjun.Stack;

import java.util.*;

public class J1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 1;
        int idx = 0;
        while (cnt <= n) {
            stack.push(cnt++);
            sb.append("+");
            while (!stack.isEmpty() && stack.peek() == arr[idx]) {
                idx++;
                stack.pop();
                sb.append("-");
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            for (char c : sb.toString().toCharArray()) {
                System.out.println(c);
            }
        }
    }
}

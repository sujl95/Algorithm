package Algorithm.Java.programmers.greedy;

import java.util.Stack;

public class P42883 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("4177252841",4));
	}
	public static String solution(String str, int k) {
		String[] arr = str.split("");
		Stack<Integer> stk = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			int comp = Integer.parseInt(arr[i]);
			for (; !stk.isEmpty() && k>0; --k) {
				int compj= stk.peek();
				if(compj>=comp) break;
				stk.pop();
			}
			stk.push(comp);
		}
		StringBuilder ans = new StringBuilder();
		for(int i=0;i<stk.size();i++) ans.append(stk.get(i));
		return new String(ans);
    }
}

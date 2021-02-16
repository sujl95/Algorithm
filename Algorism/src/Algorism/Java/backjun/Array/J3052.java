package Algorism.Java.backjun.Array;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class J3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		int A;
		for (int i = 0; i < 10; i++) {
			A = sc.nextInt();
			arr.add(A);
		}
		for (int i = 0; i < 10; i++) {
			result.add(arr.get(i) % 42);
		}
		TreeSet<Integer> arr2 = new TreeSet<>(result); // TreeSet에 arr데이터 삽입
		ArrayList<Integer> arr3 = new ArrayList<>(arr2); // 중복이 제거된 HashSet을 다시 ArrayList에 삽입
		System.out.println(arr3.size());
	}
}

package Algorithm.Java.backjun.Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			switch (s) {
			case "push":
				list.add(sc.nextInt());
				break;
			case "pop":
				if (list.size() > 0) {
					System.out.println(list.get(0));
					list.remove(0);
				} else
					System.out.println(-1);
				break;
			case "size":
				System.out.println(list.size());
				break;
			case "empty":
				System.out.println(list.size() == 0 ? 1 : 0);
				break;
			case "front":
				if (list.size() > 0)
					System.out.println(list.get(0));
				else
					System.out.println(-1);
				break;
			case "back":
				if (list.size() > 0)
					System.out.println(list.get(list.size() - 1));
				else
					System.out.println(-1);
				break;
			}
		}
	}

}

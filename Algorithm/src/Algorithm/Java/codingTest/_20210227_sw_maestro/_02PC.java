package Algorithm.Java.codingTest._20210227_sw_maestro;

import java.util.Scanner;

public class _02PC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int PCs = sc.nextInt();
		int customers = sc.nextInt();
		int hours = sc.nextInt();
		int[][] arr = new int[PCs + 1][2];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = new int[]{i, hours};
		}
		for (int i = 0; i < customers; i++) {
			int PC = sc.nextInt();
			int hour = sc.nextInt();
			if (hour < hours) {
				if (hour <= arr[PC][1]) {
					arr[PC][1] -= hour;
				}
			}
		}
		for (int i = 1; i< arr.length; i++) {
			System.out.println(arr[i][0] + " " + Math.abs(hours - arr[i][1]) * 1000);
		}
	}

}

package Algorithm.Java.programmers.level2.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p42576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// mislav, stanko, mislav, ana
		// stanko, ana, mislav
//		String []participant = sc.nextLine().split(", ");
//		String completion[] =sc.nextLine().split(", ");
		String []participant = {"leo", "kiki", "eden"};
		String completion[] = {"eden", "kiki"};
		ArrayList<String> participant1 = new ArrayList<>();
		ArrayList<String> completion1 = new ArrayList<>();
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		for(int i=0;i<completion.length; i++) {
			if(!participant[i].equals(completion[i]) ) {
				 answer = participant[i];
				 break;
			} else if(participant[completion.length-1].equals(completion[completion.length-1])) {
				answer = participant[i+1];
			}
		}
		System.out.println(answer);
		System.out.println(Arrays.toString(participant));
		System.out.println(Arrays.toString(completion));
	}

	

}

    
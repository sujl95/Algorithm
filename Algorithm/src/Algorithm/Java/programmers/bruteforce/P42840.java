package Algorithm.Java.programmers.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class P42840 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int answers[] ={1,2,3,4,5,1,2,3,4,5};
		System.out.println(Arrays.toString(solution(answers)));
	}
	public static int[] solution(int[] answers) {
        int[] answer = {};
        int s1[] = {1, 2, 3, 4, 5};
        int s2[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int s3[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt1=0,cnt2=0,cnt3= 0;
        int ans1=0,ans2=0,ans3= 0;
        for (int i=0; i<answers.length;i++) {
        	if(cnt1== 5) {
        	  cnt1=0;
        	} if(cnt2==8) {
        	  cnt2=0;
        	} if(cnt3==10) {
        	  cnt3=0;
        	}
        	if(s1[cnt1] == answers[i]) {
        		ans1++;
        	} if(s2[cnt2] == answers[i]) {
        		ans2++;
        	} if(s3[cnt3] == answers[i]) {
        		ans3++;
        	}
        	cnt1++;
        	cnt2++;
        	cnt3++;
        }
        if (ans1 == ans2 && ans2==ans3) {
        	answer = new int[3];
        	answer[0]=1;
        	answer[1]=2;
        	answer[2]=3;
        } else if (ans1 == ans2 && ans1 > ans3) {
        	answer = new int[2];
        	answer[0]=1;
        	answer[1]=2;
        } else if(ans2==ans3 && ans3 > ans1) {
        	answer = new int[2];
        	answer[0]=2;
        	answer[1]=3;
        }  else if(ans1==ans3 && ans1 > ans2) {
        	answer = new int[2];
        	answer[0]=1;
        	answer[1]=3;
        } else if (ans1 > ans2 && ans1 > ans3) {
        	answer = new int[1];
        	answer[0] =1;
        } else if (ans2 > ans1 && ans2 > ans3) {
        	answer = new int[1];
        	answer[0] =2;
        } else if (ans3 > ans1 && ans3 > ans2) {
        	answer = new int[1];
        	answer[0] =3;
        } else if (ans1 == 0 && ans2 == 0 && ans3==0) {
        	
        }
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        return answer;
    }
}

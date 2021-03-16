package Algorithm.Java.programmers.practice;

public class P12928 {

	public static void main(String[] args) {
		//https://programmers.co.kr/learn/courses/30/lessons/12928
		//약수의 합
		System.out.println(solution(12));
	}

	
	public static int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n/2;i++) {
        	if(n%i == 0) {
        		answer += i;
        	}
        }
        return answer+n;
    }
}

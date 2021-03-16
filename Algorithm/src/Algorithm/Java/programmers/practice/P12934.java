package Algorithm.Java.programmers.practice;

public class P12934 {

	public static void main(String[] args) {
		// https://programmers.co.kr/learn/courses/30/lessons/12934
		// 정수 제곱근 판별
		System.out.println(solution(121));

	}
	public static long solution(long n) {
	    if(n == Math.pow((long)Math.sqrt(n), 2) ) {
	    	return (long) Math.pow((long)Math.sqrt(n) + 1, 2);
	    } 
	    
	    return -1;
	}
}

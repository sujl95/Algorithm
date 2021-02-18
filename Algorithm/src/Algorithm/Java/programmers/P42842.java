package programmers;
import java.util.*;
public class P42842 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int brown = sc.nextInt();
		 int red = sc.nextInt();
	    int[] answer = new int[2];
	    
	    answer[0] = ((brown-2)/2);
	    answer[1] = 3;
	    System.out.println(Arrays.toString(answer));
//		solution(1,3);
	}
	 public static int[] solution(int brown, int red) {
		 Scanner sc = new Scanner(System.in);
		 brown = sc.nextInt();
		 red = sc.nextInt();
	    int[] answer = {};
	    
	    answer[0] = (brown-2)/2;
	    answer[1] = 3;
	    return answer;
    }
}

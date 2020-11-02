package Algorism.Java.backjun.bruteforce;
import java.util.*;
public class J1018_2 {
	 // 전역 변수
	   public static int start_i = 0;   // 카피 시작 좌표 X
	   public static int start_j = 0;   // 카피 시작 좌표 Y
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 // N * M 입력 받기
	     String[][] str = new String[sc.nextInt()][sc.nextInt()];
	     // 최솟값 초기값 입력 -> 바뀌는 횟수는 N * M 을 초과할수 없음
	     int min = str.length * str[0].length;
	     // 예제 맵 입력 받기
	     String s = "";
	     for (int i = 0; i < str.length; i++ ) {
	    	 s = sc.next();
	    	 str[i] = s.split("");
	     }
//	     System.out.println(Arrays.deepToString(str));
	     for(int i =0; i <=str.length-8; i++ ) {
	    	 for(int j =0 ;j<= str[0].length-8; j++) {
	    		 String[][] arr = new String[8][8];
	    		 arr = check(str);
	    		 min = change(arr,min,true);
	    		 start_j++;
	    	 }
	    	 start_i++;
	    	 start_j=0;
	     }
	     
	     System.out.println(min);
	}
	public static String[][] check(String str[][]) {
		String [][]arr = new String[8][8];
		int x = 0; int y = 0;
		for(int i =start_i; i< start_i+8;i++) {
			for(int j =start_j; j < start_j+8;j++) {
			    arr[x][y]= str[i][j];
			    y++;
			}
			x++;
			y=0;
		}
	
		return arr;
	}
	
	public static int change(String [][]arr,int min,boolean ck ) {
		int cnt =0;
		String check = (ck)? "W" : "B";
		for (int i =0; i < 8; i++) {
			for (int j = 0; j< 8; j++) {
				if((i+j) % 2 ==0) {
					if(!arr[i][j].equals(check)) {
						cnt++;
					}
				}
				else 
					if(arr[i][j].equals(check)) {
						cnt++;
					}
			}
		}
		min = cnt < min ? cnt : min;
		if(ck) {
	         return change(arr, min, false);  
	      }
		
		return min;
	}
}

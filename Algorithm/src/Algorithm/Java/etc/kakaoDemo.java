package Algorithm.Java.etc;

import java.util.*;

public class kakaoDemo {

	public static void main(String[] args) {
		
		int[][] v = {{1,4},{3,4},{3,10}};
		int[][] v1 = {{3,4},{3,10},{1,4}};
		int[][] t = {{1, 1}, {2, 2}, {1, 2}};
		System.out.println(Arrays.toString(solution(v1)));
		
	}
	
	
    public static int[] solution(int[][] v) {
        int[] xarr = new int[3];
        int[] yarr = new int[3];
        int x = 0,y =0;
        for (int i = 0; i< v.length; i++) {
        	xarr[i] = (v[i][0]);
        	yarr[i] = (v[i][1]);
        }
        Arrays.sort(xarr);
        Arrays.sort(yarr);
        
        for(int i =0; i<3; i++) {
        	int xcnt = 0, ycnt = 0;
        	for(int j =0; j<3;j++) {
        		if(xarr[i] == xarr[j]) {
        			xcnt++;
        		}
        		if(yarr[i] == yarr[j]) {
        			ycnt++;
        		}
        	}
        	if(xcnt == 1) x = xarr[i];
        	if(ycnt == 1) y = yarr[i];
        }
        
        int[] answer = {x,y};
        return answer;
    }
}

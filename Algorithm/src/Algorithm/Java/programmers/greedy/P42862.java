package Algorithm.Java.programmers.greedy;

import java.util.*;

public class P42862 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] lost1 = {2,3};

        int[] reserve = {1, 3, 5};
        int[] reserve1 = {3,4};

        solution(n, lost1, reserve1);
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) map.put(i, 1);
        map.put(0, 0);
        map.put(n+1,0);
        for(int i = 0; i < reserve.length; i++){
            for (int j = 0; j< lost.length; j++){
                if (reserve[i] == lost[j]){
                    lost[j] = -1;
                    reserve[i] = -1;
                    break;
                }
            }
        }
        for (int j : reserve) {
            if (j != -1)
                map.put(j, 2);
        }
        for (int j : lost) {
            try {
                if (map.get(j - 1) == 2) {
                    map.put(j - 1, 1);
                } else if (map.get(j) == 2) {
                    map.put(j, 1);
                } else if (map.get(j + 1) == 2) {
                    map.put(j + 1, 1);
                } else {
                    map.put(j, 0);
                }
            } catch (Exception ignored) {

            }
        }
        for (int i : map.values()) {
            if (i > 0 ) answer++;
        }
        return answer;
    }
}

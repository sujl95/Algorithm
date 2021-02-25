package Algorithm.Java.programmers.kakao;

import java.util.Arrays;

public class P16422_202009_2 {
    public static void main(String[] args) {
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        String[] orders1 = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        String[] orders2 = {"XYZ", "XWY", "WXA"};
        int[] course = {2,3,4};

        solution(orders1,course);
    }

    public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        for (int i = 0; i < orders.length; i++) {
            String[] arr = orders[i].split("");
            String temp = "";
            Arrays.sort(arr);
            for (int j = 0; j < arr.length; j++) {
                temp += arr[j];
            }
            orders[i] = temp;
        }

        for(int i = 0 ; i< orders.length;i++){
            int len = orders[i].length();
            String temp = orders[i];
            for(int j= i; j< orders.length; j++){
                if(orders[j].length() > len) {
                    temp = orders[j];
                    orders[j] = orders[i];
                    orders[i] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(orders));

        return answer;
    }
}

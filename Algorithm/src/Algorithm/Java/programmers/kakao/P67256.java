package Algorithm.Java.programmers.kakao;

import java.util.*;

public class P67256 {


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5},"right"));
    }

    public static String solution(int[] numbers, String hand) {
        int[] posL = {3,0};
        int[] posR = {3,2};
        StringBuilder answer = new StringBuilder();
        String[] numberArr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        String[][] arr = new String[][]{{"1","2","3"},{"4","5","6"},{"7","8","9"},{"*","0","#"}};
        String[] L = {"1", "4", "7"};
        String[] R = {"3", "6", "9"};
        for (int i = 0; i < numberArr.length; i++) {
            String val = numberArr[i];
            if (val.equals("1") || val.equals("4") || val.equals("7")) {
                answer.append("L");
                for (int j = 0; j < L.length; j++) {
                    if (val.equals(L[j])) {
                        posL[0] = j;
                        posL[1] = 0;
                        break;
                    }
                }
            }
            else if (val.equals("3") || val.equals("6") || val.equals("9")) {
                answer.append("R");
                for (int j = 0; j < R.length; j++) {
                    if (val.equals(R[j])) {
                        posR[0] = j;
                        posR[1] = 2;
                        break;
                    }
                }
            } else {
                for (int j = 0; j < 4; j++){
                    if (val.equals(arr[j][1])) {
                        int lDistance = Math.abs(posL[0] - j) + Math.abs(posL[1] - 1);
                        int rDistance = Math.abs(posR[0] - j) + Math.abs(posR[1] - 1);
                        if (lDistance > rDistance) {
                            posR[0] = j;
                            posR[1] = 1;
                            answer.append("R");
                        } else if (rDistance > lDistance) {
                            posL[0] = j;
                            posL[1] = 1;
                            answer.append("L");
                        } else {
                            if (hand.equals("right")) {
                                posR[0] = j;
                                posR[1] = 1;
                                answer.append("R");
                            } else {
                                posL[0] = j;
                                posL[1] = 1;
                                answer.append("L");
                            }
                        }
                        break;
                    }
                }
            }
        }
        return answer.toString();
    }
}

package Algorism.Java.programmers.kakao;

public class P17682_dartGame {
    public static void main(String[] args) {
        System.out.println(solution("1T2D3D#"));
    }

    public static int solution(String dartResult) {
        int[] scores = new int[3];
        int si = 0;
        for(int i = 0 ; i<dartResult.length();i++){
            char c = dartResult.charAt(i);
            if(Character.isDigit(c)) {
                if(scores[si] != 0) {
                    scores[si]  = 10;
                } else {
                    scores[si] = c - '0';
                }
                continue;
            }
            if( c == 'D') {
                scores[si] = (int)Math.pow(scores[si],2);
            } else if (c == 'T') {
                scores[si] = (int)Math.pow(scores[si],3);
            }
            if(i + 1< dartResult.length()) {
                char nextC = dartResult.charAt(i+1);
                if(nextC == '#') {
                    scores[si] = - scores[si];
                    i++;
                } else if(nextC == '*') {
                    scores[si] *= 2;
                    if(si-1>=0) {
                        scores[si-1] *= 2;
                    }
                    i++;
                }
            }
            si++;
        }
        int ans =0;
        for (int i : scores) {
            ans += i;
        }
        return ans;
    }



}

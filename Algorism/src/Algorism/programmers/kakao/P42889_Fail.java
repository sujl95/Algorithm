package Algorism.programmers.kakao;

import java.util.Arrays;

public class P42889_Fail {
    public static void main(String[] args) {

        int[] arr = {2,1,2,6,2,4,3,3,};
        System.out.println(solution(5,arr));
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = {};

        double[] arr = new double[N];
        Arrays.sort(stages);
        int cnt = 0;
        int temp = stages[0];
        int idx = 0;
        for(int i =0; i< stages.length;i++){
            if(temp != stages[i]) {
                arr[idx] = (double)cnt/(stages.length);
                System.out.println(stages.length);
                System.out.println((double)cnt/(stages.length));
                cnt =0;
                idx++;
            }
            if(stages[i] < N) {
                temp = stages[i];
                cnt++;
            }
        }

        System.out.println(Arrays.toString(stages));
        System.out.println(Arrays.toString(arr));
        return answer;
    }
}

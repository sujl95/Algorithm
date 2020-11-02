package Algorism.Java.codingTest._202009Naver;

import java.util.ArrayList;
import java.util.Arrays;

public class _2problem {
    static int[] arr = {6,2,5,5,4,5,6,3,7,6};
    static long[] dp = new long[101];
    static int[] Min;
    public static void main(String[] args) {
        int k = 5;

        solution(k);
    }

    static long solution(int k){
        long answer = 0;

        if (k==0)return 0;
        Arrays.fill(dp,-1);
        ArrayList<Long> list = new ArrayList<>();
        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i] <= k) {
                long max = k;
                while(true) {
                    if(max<=0) {

                        break;
                    } else {

                        answer += i ;
                        list.add(Long.parseLong(answer+""));
                        max -= arr[i];
                        if(max-arr[i]<0) {
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(list);
//        long ans =0;
//        for(int i=0; i<list.size();i++) {
//            if(ans < Long.parseLong(list.get(i))) {
//                ans= Long.parseLong(list.get(i));
//            }
//        }

        return answer =0;
    }

}

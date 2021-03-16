 package programmers;

import java.util.*;

 public class P12910 {

     public static void main(String[] args) {
         int in[] = {5,9,7,10};
         System.out.println(Arrays.toString(solution(in,5)));
     }

     public static int[] solution(int[] arr, int divisor) {
         ArrayList<Integer> list = new ArrayList<>();
         for (int i=0; i<arr.length;i++) {
             if(arr[i]%divisor == 0) {
                 list.add(arr[i]);
             }
         }
         if(list.size() == 0) {
             list.add(-1);
         }

         int[] answer = new int[list.size()];

         for(int i=0; i<list.size(); i++) {
             answer[i] = list.get(i);
         }
         Arrays.sort(answer);

 //        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
         return answer;
     }
 }

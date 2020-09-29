package Algorism.codingTest._20200911street;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3Problem {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{6,2,3,5,6,3}));
//        System.out.println(solution(new int[]{1,2,3,4}));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        List<Integer> list = new ArrayList<>();
        List<Integer> Alist = new ArrayList<>();
        int val =1;
        for(int i =0; i<A.length;i++){
            list.add(val++);
            Alist.add(A[i]);
        }
        for(int i =0;i<Alist.size();i++){
            if (list.indexOf(Alist.get(i)) != -1){
                list.set(list.indexOf(Alist.get(i)),0);
                Alist.set(i, 0);
            }
        }
        int cnt = 0;
        for(int i =0; i<list.size();i++){
            int id = list.get(i);
            System.out.println("id="+id);
            if (id != 0) {
                for(int j =0; j<Alist.size();j++){
                    int ad = Alist.get(j);
                    System.out.println("ad="+ad);
                    if(j != 0){
                        cnt+=id > ad ?  id - ad : ad - id;
                        System.out.println("cnt="+cnt);
                    } else {

                    }
                }
            } else {

            }
            id = 0;
        }
        System.out.println("cnt="+cnt);
        System.out.println(list);
        System.out.println(Alist);
        return 0;
    }
}

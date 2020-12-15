package Algorism.Java.programmers.practiceProblem;

import java.util.*;

public class P12935 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(4,3,2,1)));
    }

    public static int[] solution(int... arr) {
        if (arr.length == 1) return new int[]{-1};
        int min =  Arrays.stream(arr).min().getAsInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr)
            if (i != min) list.add(i);
        return list.stream().mapToInt(i -> i).toArray();
    }
}

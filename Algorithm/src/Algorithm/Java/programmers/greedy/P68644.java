package Algorithm.Java.programmers.greedy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P68644 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(2, 1, 3, 4, 1)));
    }

    public static int[] solution(int... numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}

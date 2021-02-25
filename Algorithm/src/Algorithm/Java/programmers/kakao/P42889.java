package Algorithm.Java.programmers.kakao;

import java.util.*;

public class P42889 {

    public static void main(String[] args) {
//        System.out.println(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
        System.out.println(Arrays.toString(solution(4, new int[] {4, 4, 4, 4, 4})));
    }

    public static int[] solution(int N, int[] stages) {
        int people = stages.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Double> res = new HashMap<>();
        for (int stage : stages) {
            map.merge(stage, 1, Integer::sum);
        }
        for (int i = 1; i <= N; i++) {
            if (map.containsKey(i)) {
                res.put(i, (double)map.get(i) / people);
                people -= map.get(i);
            } else {
                res.put(i, 0.0);
            }
        }
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(res.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).getKey();
        }
        return answer;
    }
}

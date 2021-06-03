package Algorithm.Java.backjun.topologicalsort;

import java.util.*;

public class J2252_1 {
    static int N; // 그래프 정점의 수
    static int M; // 간선의 수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] arr = new int[N+1]; // 간선의 수에 대한 배열

        // 가중치가 없는 그래프(인접 그래프)
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            graph.get(v1).add(v2);
            arr[v2]++;
        }
        TopologicalSort(graph,arr);
    }

    static void TopologicalSort(List<List<Integer>> graph, int[] arr) {
        Queue<Integer> queue = new LinkedList();
        for (int i = 1; i < N + 1; i++) {
            if (arr[i] == 0) {
                queue.add(i);
            }
        }
        for(int i = 0; i < N; i++){
            int v = queue.remove();
            System.out.print("v="+v + " ");
            for (int next : graph.get(v)){
                System.out.println("next"+next);
                System.out.println("graph.get(v)="+graph.get(v));
                System.out.println("--arr[next]"+arr[next]);
                if (--arr[next]==0){
                    queue.add(next);
                    System.out.println(queue);
                }
            }
        }
    }
}

package Algorism.Java.backjun.TopologicalSort;

import java.util.*;

public class J1005 {
    static int n, k;
    static int[] time;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트케이스 개수 T
        for(int i = 0 ; i < t; i++){
            n = sc.nextInt(); //건물의 개수 N
            k = sc.nextInt(); // 간선의 개수 k
            time = new int[n+1];
            List<List<Integer>> graph = new ArrayList<List<Integer>>();
            for(int j = 0; j< n+1; j++)
                graph.add(new ArrayList<Integer>());

            int[] arr = new int[n+1];

            for(int j = 1; j< n+1; j++)
                time[j] = sc.nextInt();
            for(int j = 0; j < k; j++ ) {
                int v1 = sc.nextInt();
                int v2 = sc.nextInt();
                graph.get(v1).add(v2);
                arr[v2]++;
            }
            int w = sc.nextInt();
            topologicalSort(graph,arr,w);
        }
    }


    static void topologicalSort(List<List<Integer>> graph,int[] arr, int w) {
        Queue<Integer> q = new LinkedList<Integer>();
        int[] result = new int[n+1];

        //건물의 소요 기본 시간은 d[i]
        for(int i = 1; i<n+1;i++){
            result[i] = time[i];

            if(arr[i] == 0 ) q.add(i);
        }

        // 건물의 총 소요시간 = 이전까지의 소요시간 + 현재 건물 소요시간
        // Max 해주는 이유는 이전 테크를 다 올라야 현재 건물을 지을 수 있기 때문
        while(!q.isEmpty()){
            int node = q.remove();

            for(Integer i : graph.get(node)){
                result[i] = Math.max(result[i], result[node]+time[i]);
                arr[i]--;

                if(arr[i]==0)
                    q.add(i);
            }
        }
        System.out.println(result[w]);

    }

}

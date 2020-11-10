package Algorism.Java.ThisisCodingTest.BFS;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _1BFSSample {

    private static boolean[] visited = new boolean[8];

    private static int[][] edges = new int[][] {
            {0,1,1,0,0,0,0,1},
            {1,0,0,0,0,0,1,0},
            {1,0,0,1,1,0,0,0},
            {0,0,1,0,1,0,0,0},
            {0,0,1,1,0,0,0,0},
            {0,0,0,0,0,0,1,0},
            {0,1,0,0,0,1,0,1},
            {1,0,0,0,0,0,1,0}
    };

    public static void main(String[] args) {
        int i = 0;
        //1. 탐색 시작 노드를 큐에 삽입하고 방문처리를 한다
        Queue<Integer> q = new LinkedList();
        q.offer(i);
        visited[i] = true;
        System.out.print(i + " ");
        System.out.println(Arrays.toString(visited));
        System.out.println(q);
        //2. 큐에서 노드를 꺼내 해당 노드의 인접 노드 중에서
        // 방문하지 않은 노드를 모두 큐에 삽입하고 방문 처리를 한다
        //3. 2번 과정을 더 이상 수행할 수 없을 때까지 반복한다.
        while (!(q.isEmpty())) {
            int x = q.poll();
            System.out.println(x);
            System.out.print(x+ " ");
            for(int j = 0; j< edges[x].length; j++){
                int y = edges[x][j];
                if (!visited[y]){
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }

        System.out.println(Arrays.toString(visited));

    }
}

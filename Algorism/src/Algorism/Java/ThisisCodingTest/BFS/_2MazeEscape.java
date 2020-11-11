package Algorism.Java.ThisisCodingTest.BFS;

import java.util.*;


class Node {
    int x ;
    int y ;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

public class _2MazeEscape {

    private static int n = 5;
    private static int m = 6;
    private static int[][] edges = {
            {1, 0, 1, 0, 1, 0},
            {1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1}
    };



    public static void main(String[] args) {
        bfs(0, 0);
        System.out.println(edges[n-1][m-1]);
    }


    public static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList();
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        q.offer(new Node(x, y));
        while (!q.isEmpty()) {
            Node node = q.poll();
            x = node.x;
            y = node.y;
            //1. 사방 확인
            for (int i = 0; i < 4; i++) {
                int nx =  x + dx[i];
                int my =  y + dy[i];
                //2. 배열 벗어나는지 확인
                if (nx < 0 || nx >= n || my < 0 || my >= m) continue;
                //3. 벽일 경우
                if (edges[nx][my] == 0) continue;
                //4. 해당 노드를 처음 방문하는 경우에만 최단 거리를 기록
                if (edges[nx][my] == 1) {
                    edges[nx][my] = edges[x][y] + 1;
                    q.offer(new Node(nx, my));
                }
            }
        }
    }
}

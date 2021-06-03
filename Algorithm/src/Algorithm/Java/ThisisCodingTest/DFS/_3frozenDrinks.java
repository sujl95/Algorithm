package Algorithm.Java.ThisisCodingTest.DFS;

public class _3frozenDrinks {


    private static int n = 4;
    private static int m = 5;

    private static boolean[][] visited = new boolean[n][m];

    private final static int[][] edges = {
            {0, 0, 1, 1, 0},
            {0, 0, 0, 1, 1},
            {1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0}
    };

    private static int cnt = 0;

    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i,j)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    private static boolean dfs(int x, int y) {
        if (x < 0 || x >= n || y < 0 || y >= m ) return false;
        if (edges[x][y] == 0) {
            //노드 방문 처리
            edges[x][y] = 1;
            //상 하 좌 우 위치 모두 재귀적 호출
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }

        return false;
    }

}

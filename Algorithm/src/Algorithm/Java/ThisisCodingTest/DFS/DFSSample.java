package Algorithm.Java.ThisisCodingTest.DFS;

public class DFSSample {
//    private static List<Node> edges = new ArrayList<>();

    private static boolean[] visited ;

    public static void main(String[] args) {
        int n = 8;
        visited = new boolean[n];

        int[][] edges = new int[][] {
            {0,1,1,0,0,0,0,1},
            {1,0,0,0,0,0,1,0},
            {1,0,0,1,1,0,0,0},
            {0,0,1,0,1,0,0,0},
            {0,0,1,1,0,0,0,0},
            {0,0,0,0,0,0,1,0},
            {0,1,0,0,0,1,0,1},
            {1,0,0,0,0,0,1,0}
        };

        dfs(edges,0);
    }

    public static void dfs(int[][] edges, int i) {
        System.out.print(i+1 + " ");
        visited[i] = true;
        for (int j = 0; j < edges[i].length; j++) {
            if (edges[i][j] == 1 && !visited[j]) {
                dfs(edges,j);
            }
        }
    }
}

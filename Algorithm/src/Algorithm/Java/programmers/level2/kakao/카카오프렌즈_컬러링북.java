package Algorithm.Java.programmers.level2.kakao;

import java.util.ArrayDeque;
import java.util.Queue;

public class 카카오프렌즈_컬러링북 {

  static class Position {

    int x;
    int y;

    Position(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  private static final int[] dx = {-1, 0, 1, 0};
  private static final int[] dy = {0, 1, 0, -1};
  private static boolean[][] visited;

  public static void main(String[] args) {

  }

  public int[] solution(int m, int n, int[][] picture) {
    int numberOfArea = 0;
    int maxSizeOfOneArea = 0;
    visited = new boolean[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (picture[i][j] != 0 && !visited[i][j]) {
          maxSizeOfOneArea = Math.max(maxSizeOfOneArea, bfs(m, n, i, j, picture));
          numberOfArea++;
        }
      }
    }
    return new int[]{numberOfArea, maxSizeOfOneArea};
  }

  public int bfs(int m, int n, int x, int y, int[][] picture) {
    int range = 1;
    int target = picture[x][y];
    Queue<Position> q = new ArrayDeque<>();
    visited[x][y] = true;
    q.offer(new Position(x, y));
    while (!q.isEmpty()) {
      Position p = q.poll();
      for (int i = 0; i < 4; i++) {
        int nx = p.x + dx[i];
        int ny = p.y + dy[i];
        if (nx >= 0 && nx < m && ny >= 0 && ny < n && picture[nx][ny] == target
            && !visited[nx][ny]) {
          q.offer(new Position(nx, ny));
          visited[nx][ny] = true;
          range++;
        }
      }
    }
    return range;
  }
}

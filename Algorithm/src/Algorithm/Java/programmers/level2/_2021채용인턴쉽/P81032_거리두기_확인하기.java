package Algorithm.Java.programmers.level2._2021채용인턴쉽;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class P81032_거리두기_확인하기 {

  private class Position {

    public Position(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }

    int x;
    int y;
  }


  private String[][] places = new String[5][5];
  private String[][] place = new String[5][5];

  public static void main(String[] args) {
    String[][] places =
        {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
            {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
            {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
            {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
            {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
    System.out.println(Arrays.toString(new P81032_거리두기_확인하기().solution(places)));
  }

  public int[] solution(String[][] places) {
    int[] answer = {1, 1, 1, 1, 1};
    this.places = places;

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        String[] line = places[i][j].split("");
        System.arraycopy(line, 0, place[j], 0, 5);
      }
      if (!isDistance()) {
        answer[i] = 0;
      }
    }

    return answer;
  }

  private boolean isDistance() {
    for (int j = 0; j < 5; j++) {
      for (int k = 0; k < 5; k++) {
        if (this.place[j][k].equals("P")) {
          if (!bfs(j, k)) {
            return false;
          }
        }
      }
    }
    return true;
  }

  private boolean bfs(int x, int y) {
    final int[] dx = {0, 1, 0, -1};
    final int[] dy = {1, 0, -1, 0};
    Deque<Position> q = new ArrayDeque<>();
    q.offer(new Position(x, y));

    while (!q.isEmpty()) {
      Position position = q.poll();

      for (int i = 0; i < 4; i++) {
        int nx = position.getX() + dx[i];
        int ny = position.getY() + dy[i];

        if (0 > nx || nx >= 5 || 0 > ny || ny >= 5 || (nx == x && ny == y)) {
          continue;
        }

        int distance = Math.abs(nx - x) + Math.abs(ny - y);

        if (this.place[nx][ny].equals("P") && distance <= 2) {
          return false;
        } else if (this.place[nx][ny].equals("O") && distance < 2) {
          q.offer(new Position(nx, ny));
        }
      }
    }
    return true;
  }
}


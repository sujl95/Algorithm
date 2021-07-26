package Algorithm.Java.programmers.level2.summer_winter;

public class P49994_방문길이 {

	public static void main(String[] args) {
		String dirs = "ULURRDLLU";
		System.out.println("solution() = " + solution(dirs));
	}

	public static int solution(String dirs) {
		int answer = 0;
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		int x;
		int y;
		int nx = 5;
		int ny = 5;
		boolean[][][][] visited = new boolean[11][11][11][11];
		for (int i = 0; i < dirs.length(); i++) {
			char c = dirs.charAt(i);
			int idx;
			x = nx;
			y = ny;
			if (c == 'R') {
				idx = 0;
			} else if (c == 'L') {
				idx = 1;
			} else if (c == 'U') {
				idx = 2;
			} else {
				idx = 3;
			}
			if (0 <= x + dx[idx] && x + dx[idx] < 11 && 0 <= y + dy[idx] && y + dy[idx] < 11) {
				nx = x + dx[idx];
				ny = y + dy[idx];
				if (!visited[x][y][nx][ny] && !visited[nx][ny][x][y]) {
					visited[x][y][nx][ny] = true;
					visited[nx][ny][x][y] = true;
					answer++;
				}
			}
		}
		return answer;
	}
}

package Algorithm.Java.programmers.level2.Greedy;


public class P42860_Joystick {
	public static void main(String[] args) {
		System.out.println("solution(\"JEROEN\") = " + solution("JEROEN"));
	}

	public static int solution(String name) {
		int answer = 0;
		int cnt = 0;
		boolean[] visited = new boolean[name.length()];
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (c != 'A') {
				if (c <= 'N') {
					answer += (c - 'A');
				} else {
					answer += ('Z' - c + 1);
				}
				++cnt;
			} else {
				visited[i] = true;
			}
		}
		int pos = 0;
		for (int i = 0; i < cnt; i++) {
			if (visited[pos]) {
				int idxL = pos;
				int idxR = pos;
				int L = 0;
				int R = 0;

				while (visited[idxL]) {
					if (idxL == 0) {
						idxL = name.length()-1;
					} else {
						--idxL;
					}
					++L;
				}

				while (visited[idxR]) {
					idxR = (idxR + 1) % name.length();
					++R;
				}

				if (L >= R) {
					pos = idxR;
					answer += R;
				} else {
					pos = idxL;
					answer += L;
				}
			}
			visited[pos] = true;
		}


		return answer;
	}
}

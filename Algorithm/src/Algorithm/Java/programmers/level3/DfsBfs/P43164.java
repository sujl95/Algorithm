package Algorithm.Java.programmers.level3.DfsBfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P43164 {

	boolean[] visited;
	List<String> list = new ArrayList<>();


	public static void main(String[] args) {
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		P43164 p43164 = new P43164();
		System.out.println("solution(tickets) = " + Arrays.toString(p43164.solution(tickets)));
	}

	public String[] solution(String[][] tickets) {
		visited = new boolean[tickets.length];
		for (int i = 0; i < visited.length; i++) {
			if ("ICN".equals(tickets[i][0])) {
				visited[i] = true;
				dfs(tickets[i][1], 1, new StringBuilder("ICN "), tickets);
				visited[i] = false;
			}
		}
		Collections.sort(list);
		return list.get(0).split(" ");
	}

	public void dfs(String ticket, int idx, StringBuilder sb, String[][] tickets) {
		sb.append(ticket).append(" ");
		if (idx == visited.length) {
			list.add(sb.toString());
			return;
		}
		for (int i = 0; i < visited.length; i++) {
			if (tickets[i][0].equals(ticket) && !visited[i]) {
				visited[i] = true;
				dfs(tickets[i][1], idx+1, sb, tickets);
				visited[i] = false;
				sb.delete(sb.length() - 4, sb.length());
			}
		}
	}
}

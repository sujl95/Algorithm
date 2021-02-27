package Algorithm.Java.codingTest._20210227_SWMaestro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _01Skill {
	static List<String> list = new ArrayList<>();
	static boolean[] visited;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] skills = sc.nextLine().split(" ");
		int n = sc.nextInt();
		String[][] linkSkills = new String[n][2];
		visited = new boolean[linkSkills.length];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String[] strings = sc.nextLine().split(" ");
			linkSkills[i] = strings;
		}

		for (int i = 0; i < n; i++) {
			visited[i] = true;
			dfs(linkSkills[i][0], 1, new StringBuilder(linkSkills[i][1]), linkSkills);
			visited[i] = false;
		}
		System.out.println("skills = " + Arrays.toString(skills));
		System.out.println("linkSkills = " + Arrays.deepToString(linkSkills));
		System.out.println("list = " + list);
	}

	public static void dfs(String skill, int idx, StringBuilder sb, String[][] linkSkills) {
		sb.append(skill).append(" ");
		if (idx == visited.length) {
			list.add(sb.toString());
			return;
		}
		for (int i = 0; i < visited.length; i++) {
			if (linkSkills[i][1].equals(skill) && !visited[i]) {
				visited[i] = true;
				dfs(linkSkills[i][1], idx+1, sb, linkSkills);
				visited[i] = false;
			}
		}
	}
}

package Algorithm.Java.programmers.level2.summer_winter;

import java.util.HashMap;
import java.util.Map;

public class P49993_스킬트리 {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		System.out.println("solution() = " + solution(skill, skill_trees));
	}


	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		for (int i = 0; i < skill_trees.length; i++) {
			Map<Character, Integer> map = new HashMap<>();
			for (int j = 0; j < skill.length(); j++) {
				char c = skill.charAt(j);
				map.put(c, j);
			}
			String skillTree = skill_trees[i];
			if (isSkillTree(map, skillTree)) {
				answer++;
			}
		}
		return answer;
	}

	private static boolean isSkillTree(Map<Character, Integer> map, String skillTree) {
		int idx = 0;
		for (int j = 0; j < skillTree.length(); j++) {
			char c = skillTree.charAt(j);
			Integer value = map.get(c);
			if (value != null) {
				if (idx == value) {
					idx++;
					continue;
				}
				return false;
			}
		}
		return true;
	}

}

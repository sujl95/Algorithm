package Algorithm.Java.programmers.level2.summer_winter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class P49993_스킬트리_New {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		System.out.println("solution() = " + solution(skill, skill_trees));
	}


	public static int solution(String skill, String[] skill_trees) {
		int answer;
		List<String> skillTrees = new ArrayList<>(Arrays.asList(skill_trees));
		Iterator<String> it = skillTrees.iterator();
		while (it.hasNext()) {
			if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
				it.remove();
			}
		}
		answer = skillTrees.size();
		return answer;
	}


}

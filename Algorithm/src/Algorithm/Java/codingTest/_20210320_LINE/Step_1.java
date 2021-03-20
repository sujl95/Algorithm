package Algorithm.Java.codingTest._20210320_LINE;

import java.util.Arrays;

public class Step_1 {
	public static void main(String[] args) {
		String program = "line";
		String[] flag_rules = {"-s STRING", "-n NUMBER", "-e NULL"};
		String[] commands = {"line -n 100 -s hi -e", "lien -s Bye"};
		String[] commands2 = {"line -s 123 -n HI", "line fun"};
		String[] commands3 = {"line -s asd -n 123 -e", "line -e"};
		System.out.println("solution() = " + Arrays.toString(solution(program, flag_rules, commands2)));

	}
	public static boolean[] solution(String program, String[] flag_rules, String[] commands) {
		boolean[] answer = new boolean[commands.length];
		Object[] arr = Arrays.stream(flag_rules).map(str -> str.split(" ")[0]).toArray();
		System.out.println("arr = " + Arrays.toString(arr));
		for (int i = 0; i < commands.length; i++) {
			String[] command = commands[i].split(" ");
			if (!command[0].equals(program)) {
				answer[i] = false;
				continue;
			}
			boolean isCheck = true;
			for (int j = 1; j < command.length; j++) {
				String s = command[j];
				if (s.equals("-s")) {
					if (j < command.length -1) {
						String nextStr = null;
						try {
							nextStr = command[j + 1];
						} catch (Exception e) {
							isCheck = false;
							continue;
						}
						boolean ck = true;
						for (int k = 0; k < flag_rules.length; k++) {
							if (nextStr.equals(flag_rules[k])) {
								ck = false;
								break;
							}
						}
						if (!ck) {
							isCheck = false;
						}
						for (int k = 0; k < nextStr.length(); k++) {
							if (Character.isDigit(nextStr.charAt(k))) {
								isCheck = false;
								break;
							}
						}
						j++;
					}
				}
				if (s.equals("-n")) {
					if (j < command.length -1) {
						String nextStr = null;
						try {
							nextStr = command[j + 1];
						} catch (Exception e) {
							isCheck = false;
							continue;
						}

						boolean ck = true;
						for (String flag_rule : flag_rules) {
							if (nextStr.equals(flag_rule)) {
								ck = false;
								break;
							}
						}
						if (!ck) {
							isCheck = false;
						}
						for (int k = 0; k < nextStr.length(); k++) {
							if (!Character.isDigit(nextStr.charAt(k))) {
								isCheck = false;
								break;
							}
						}
						j++;
					}
				}
				if (s.equals("-e")) {
					if (j == command.length-1) {
						isCheck = true;
						continue;
					}
					if (j < command.length-1) {
						String nextStr = command[j + 1];
						boolean ck = false;
						for (int k = 0; k < flag_rules.length; k++) {
							if (nextStr.equals(flag_rules[k])) {
								ck = true;
								break;
							}
						}
						if (!ck) {
							isCheck = false;
						}
					}
				}
				String s1 = command[j - 1];
				if (!(s1.equals("-s") || s1.equals("-n") || !s1.equals(program))) {
					isCheck = false;
				}
			}
			answer[i] = isCheck;
		}

		return answer;
	}
}

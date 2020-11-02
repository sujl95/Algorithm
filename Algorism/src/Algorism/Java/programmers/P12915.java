package Algorism.Java.programmers;

import java.util.*;

public class P12915 {

	public static void main(String[] args) {
		String arr[] = {"abcd", "abce", "cdx"};
		System.out.println(Arrays.toString(solution(arr,2)));
		
	}
	public static String[] solution(String[] strings, int n) {
	      ArrayList<String> list = new ArrayList<>();
	      for (int i=0; i<strings.length; i++) {
	    	  list.add(strings[i].substring(n)+i);
	    	  System.out.println(strings[i].substring(n)+i);
	      }
	      list.sort(null);
	      String[] answer = new String[list.size()];
	      for(int i=0; i<list.size(); i++) {
	    	  answer[i] = strings[Integer.parseInt(list.get(i).substring(list.get(i).length()-1, list.get(i).length()))];
	    	  
	      }
	      return answer;
    }
}

package Algorism.etc;

import java.util.*;
import java.util.function.Function;

public class tosstest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = sc.nextLine().split(" ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		String[] ans = new String[arr.length];
		for(int i = 0 ; i < arr.length; i++) {
			if(map.get(Integer.parseInt(arr[i])) == null) {
//				map.put(Integer.parseInt(arr[i]),Function.compute(Integer.parseInt(arr[i])));
			}
		}
		
		for(int i = 0; i< arr.length; i++) {
			if(i == arr.length-1) {
				System.out.print(map.get(Integer.parseInt(arr[i])));
			} else {
				System.out.print(map.get(Integer.parseInt(arr[i]))+ " ");
			}
		}
	}
}

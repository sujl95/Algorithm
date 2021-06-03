package Algorithm.Java.backjun.word;

import java.util.ArrayList;
import java.util.Scanner;

public class J1316 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//1.개수를 입력받는다
		//2.단어를 입력받는다
		//3.입력받은 값을 중복을 제거한다
		//4.단어입력 받은 것을
		int c = sc.nextInt();
		char abc[] = new char[26];
		int rcnt = 0;
		for (int i=0;i<c; i++) {
			int cnt = 0;
//			char str[] = sc.next().trim().toCharArray();
			String str = sc.next().trim();
			ArrayList<String> res = new ArrayList<String>();
			for(int j=0; j<str.length();j++) {
				if(res.equals(str.charAt(j)) && str.length() > j+1){
				  System.out.println("체크");
				} else {
					res.add(""+str.charAt(j));
					System.out.println(res.add(""+str.charAt(j)));
					
				}
			}
			System.out.println(res.toString());
			
//			char res[] = new char[str.length];
//			res[0] = str[0];
//			for (int j =0; j<str.length;j++) {
//				for(int k=0; k<res.length; k++) {
//					if(j == k) {
//						continue;
//					}
//					System.out.println(Arrays.toString(res));
//					if(str[k] == res[cnt]) {
//						System.out.println("중복 => " + j + ". " + res[cnt]);
//						System.out.println("중복 => " + j + ". " + str[j]);
//						System.out.println("중복 => " + j + ". " + str[k]);
//						
//						break;
//					}else {
//						cnt++;
//						res[cnt]= str[j];
//						break;
//					}
//				}
//			}
//			System.out.println(Arrays.toString(str));
		}
		
		
	}

}

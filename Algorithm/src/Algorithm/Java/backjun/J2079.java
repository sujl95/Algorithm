package Algorithm.Java.backjun;

public class J2079 {

	public static void main(String[] args) {
		System.out.println(solution("abbbbb"));
	}
	
	
	public static int solution (String s) {
		//1. i를 0부터 length 까지 for문을 돌린다
		//2. cnt선언   for문하나더 i부터 cnt만큼 증가해서 length까지잘라서 앞 뒤가 같은지 
		//   비교 하고 i부터 cnt만큼 잘라서 length와 인덱스값을 저장한뒤  
		//3. cnt만큼 잘랐는데 
		if (s.equals(reverse(s))) {
			return 1;
		}
		for (int i = 0; i < 2; i++) {
			String substring = s.substring(i, s.length());
			if (substring.equals(reverse(substring))) {
				return 2;
			}
		}
//		1. 팰린드롬이 나오는경우 앞뒤로 똑같아야한다 (reverse해서 자르기 전값과 리버스한 값이 같아야함)
//		2. for문 index 0부터 str.length까지 i++ 
//		3. 예시 anavolimilana 이면 자를 갯수 cnt, 결과값 res 선언후 substring(i,i+cnt) 자르고
//		 자르기전 값과 reverse한값이 같을때 팰린드롬 되었을때 cnt와 index length를 저장한뒤 length까지 cnt++하여서 반복하여
//		 팰린드롬이없으면 res++ , i 값에 i+cnt값 대입 
//		 이런식(?)으로 반복
//		 ana 가 잘리면 res++ 
//		 volimilana v에서 시작하면 팰린드롬이 없기때문에 o부터 시작
//		 olimilana 
//		 시간복잡도 NlogN예상
		
		int cnt = 2;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length() - cnt; j++) {
				String str = s.substring(i, j + cnt);
				if (str.equals(reverse(str))) {
					i = j;
					System.out.println(str);
				}
			}
		}
		return s.length();
	}
	
	public static String reverse(String s) {
		return new StringBuffer(s).reverse().toString();
	}

}

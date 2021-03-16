package Algorithm.Java.backjun.If;

public class J14681 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r;
		if(x>0&&y>0) {
			r=1;
		} else if (x>0&&y<0){
			r=4;
		} else if (x<0&&y>0){
			r=2;
		} else{
			r=3;
		}
		System.out.println(r);
	}

}

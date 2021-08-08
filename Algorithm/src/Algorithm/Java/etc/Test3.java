package Algorithm.Java.etc;

public class Test3 {

	public static void main(String[] args) {
		int currentPage = 20;       // 현재 페이지
		int totalPage = 2312;      // 총페이지 개수
		int pageBlock = 10;        // 한블록당 몇 개 페이지를 보여줄지

		/* logic */
		int currentBlock = currentPage / pageBlock;        //현재블록번호
		int lastBlock = totalPage / pageBlock;             //마지막블록번호
		int startNum = currentBlock * pageBlock + 1;         //시작페이지
		int endNum = currentBlock * pageBlock + pageBlock + 1; // 마지막페이지

		System.out.println("currentBlock = " + currentBlock);
		System.out.println("lastBlock = " + lastBlock);
		System.out.println("startNum = " + startNum);
		System.out.println("endNum = " + endNum);
	}

}

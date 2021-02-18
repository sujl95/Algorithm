package Algorithm.Java.ThisisCodingTest.Implementation;

public class _2night {

    public static void main(String[] args) {
        System.out.println(solution("a1"));
    }

    public static int solution(String s){
        int row = Integer.parseInt(s.charAt(1)+"")-1;
        int column = s.charAt(0)- 97;
        int cnt = 0;
        int[][] steps = {{-2,-1}, {-2 ,1}, {-1,2},{-1,-2},{2,1},{2,-1},{1,-2},{1,2}};
        for (int i = 0; i < steps.length; i++) {
            if (row + steps[i][0] >= 0 && row + steps[i][0] <= 7 && column + steps[i][1] >= 0 && column + steps[i][1] <= 7) {
                cnt++;
            }
        }
        return cnt;
    }
}

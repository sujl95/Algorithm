package Algorithm.Java.codingTest._20200911street;

public class _1Problem {
    public static void main(String[] args) {
        System.out.println(solution("aabab"));
        System.out.println(solution("dog"));
    }

    public static int solution(String S) {
        if(S.contains("aaaa")) return -1;
        if(S.length() == 2 && S.contains("aa")) return 0;
        int aCnt = 0;
        int aPCnt = 0;
        String str = "";
        for(int i =0 ; i< S.length();i++){
            char c = S.charAt(i);
            if(c == 'a'){
                aCnt++;
            } else {
                str += "a"+c+"a";
                aPCnt++;
            }
        }

        str = "a"+str+"a";
        aPCnt++;
        return (aPCnt*2)-aCnt;
    }
}

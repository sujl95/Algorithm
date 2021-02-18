package Algorithm.Java.programmers.kakao;

public class P16422_202009_1 {

    public static void main(String[] args) {
        System.out.println(solution("abcdefghijklmn.p"));
    }

    public static String solution(String new_id) {
        String answer = "";

//      1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
//      2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        String str = new_id.toLowerCase().replaceAll("[^a-z0-9,_.-]","");
        System.out.println("step12="+str);
//      3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        String temp = "";
        if(str.length() <= 1){
            temp = str;
        } else {
            for(int i = 0;i<str.length();i++){
                char c = str.charAt(i);
                if( i+1 <str.length() && c == '.' && str.charAt(i+1) == '.') continue;
                temp += c;

            }
        }
        str = temp;
        System.out.println("step3="+str);
//      4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        try{
            if(str.charAt(0) == '.'){
                str = str.substring(1,str.length());
            }
        }catch (Exception e) {

        }
        try {
            if(str.charAt(str.length()-1) == '.'){
                str = str.substring(0,str.length()-1);
            }
        } catch (Exception e) {

        }

        System.out.println("step4="+str);
//      5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if("".equals(str)) str = "a";
        System.out.println("step5="+str);
//      6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//           만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if(str.length() >= 16) str =  str.substring(0,15);
        if(str.charAt(str.length()-1) == '.'){
            str = str.substring(0,str.length()-1);
        }
        System.out.println("step6="+str);
//      7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(str.length() <= 2) {
            while(str.length() < 3){
                str += str.charAt(str.length()-1);
            }
        }
        System.out.println("step7="+str);


        return str;
    }

}


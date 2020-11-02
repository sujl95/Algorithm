package Algorism.Java.codingTest._202010WinterCoding;

public class _2 {
    public static void main(String[] args) {
        solution("qyyigoptvfb", "abcdefghijk", 3);
    }

    public static String solution(String encrypted_text, String key, int rotation) {
        String answer = "";

        for (int i = 0; i < rotation; i++) {
            char add = encrypted_text.charAt(0);
            encrypted_text = encrypted_text.substring(1)+add;
        }

        for (int i = 0; i < encrypted_text.length(); i++) {
            char et = encrypted_text.charAt(i);
            char k = key.charAt(i);
            answer +=(char) (et - ( k-'a'+1)) < 97 ? (char)(et - (k-'a'+1) +26) : (char)(et - (k-'a'+1));
        }

        System.out.println(answer);

        return answer;
    }
}

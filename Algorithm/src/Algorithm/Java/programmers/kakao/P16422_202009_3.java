package Algorithm.Java.programmers.kakao;

import java.util.Arrays;

public class P16422_202009_3 {
    public static void main(String[] args) {
        String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
        solution(info,query);
    }

    public static int[] solution(String[] info, String[] query) {
        int[] answer = {};
        Arrays.sort(info);
        Arrays.sort(query);
        String[][] arr = new String[info.length][6];
        String[][] arr1 = new String[query.length][6];
        String[] lang = {"cpp","java","python"};
        String[] febe = {"frontend","backend"};
        String[] js = {"junior","senior"};
        String[] sfood = {"chicken","pizza"};

        for(int i =0; i<info.length; i++){
            arr[i] = info[i].split(" ");
        }
        for(int i = 0; i < query.length; i++){
            arr1[i] = query[i].replace("and ","").split(" ");
        }

        System.out.println(Arrays.stream(arr[1]).anyMatch("java"::equals));


//        for(int i = 0; i<arr1.length; i++){
//            for(int j = 0; j< arr1[j].length; j++){
//                if(j == 3) {
//                    String[] arrf = arr1[i][j].split(" ");
//                    String food = arrf[0];
//                    String point = arrf[1];
//                } else {
//                    if(arr1[i][j].equals("-")) {
//                       continue;
//                    } else {
//                        String str = arr1[i][j];
//                        System.out.println(str);
//                        for(int k = 0; k< arr.length; k++){
//                            Arrays.stream(arr[k]).anyMatch(str::equals);
//                        }
//
//                    }
//                }
//
//            }
//        }


        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr1));
        return answer;
    }
}

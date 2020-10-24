package Algorism.codingTest._202010NHN;

import java.util.Arrays;
import java.util.Scanner;

public class _02 {
    private static void solution(int day, int width, int[][] blocks) {
        // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.
        int cnt = 0;
        int left = 0;
        int index = 0;
        int right = 0;

        System.out.println(blocks.length);
        System.out.println(Arrays.deepToString(blocks));
        for(int i = 0; i< blocks.length;i++){
            cnt = 0;
            for(int j = 1; j<blocks[i].length-1;j++){
                left = blocks[i][j-1];
                index = blocks[i][j];
                right = blocks[i][j+1];

                if(left > index && index < right) {
                    System.out.println(left);
                    System.out.println(index);
                    System.out.println(right);
                    blocks[i][j] += (left > right) ? right-index : left - index;
                    cnt += (left > right) ? right-index : left - index;
                } else {
                    int y = 0;
                    right =blocks[i][j+y];
                    y++;
                }

            }
            System.out.println("cnt="+cnt);
        }

        System.out.println(Arrays.deepToString(blocks));
    }

    private static class InputData {
        int day;
        int width;
        int[][] blocks;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.day = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.width = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.blocks = new int[inputData.day][inputData.width];
            for (int i = 0; i < inputData.day; i++) {
                String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
                for (int j = 0; j < inputData.width; j++) {
                    inputData.blocks[i][j] = Integer.parseInt(buf[j]);
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.day, inputData.width, inputData.blocks);
    }
}

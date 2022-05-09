package Algorithm.Java.backjun.twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J11728_배열합치기 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int size = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).sum();


    int[] oneArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
    int[] twoArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
    int oneIdx = 0;
    int twoIdx = 0;
    StringBuilder sb = new StringBuilder();
    while(oneIdx + twoIdx < size) {
      if (oneIdx == oneArray.length) {
        sb.append(twoArray[twoIdx++]).append(" ");
      } else if (twoIdx == twoArray.length) {
        sb.append(oneArray[oneIdx++]).append(" ");
      } else {
        if (oneArray[oneIdx] > twoArray[twoIdx]) {
          sb.append(twoArray[twoIdx++]).append(" ");
        } else {
          sb.append(oneArray[oneIdx++]).append(" ");
        }
      }
    }
    System.out.println(sb);
  }
}

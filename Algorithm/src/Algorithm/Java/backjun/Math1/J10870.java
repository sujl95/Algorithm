package Algorithm.Java.backjun.Math1;

public class J10870 {
   //재귀함수..
   public static int RecursiveSum(int i) {
      if(i == 1) return 1;
      System.out.println(i);
      return i + RecursiveSum(i - 1);
   }
   //그냥 일반적인 for문
   public static int NormalSum(int i) {
      int sum = 0;
      for(int j = 1; j <= i; j++) sum += j;
      return sum;
   }
   public static void main(String[] args) {
      System.out.println(RecursiveSum(10));
      System.out.println(NormalSum(10));
   }
}
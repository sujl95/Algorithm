package Algorithm.Java.etc;

public class 정수콤마찍기 {

  public static void main(String[] args) {
    System.out.println(new 정수콤마찍기().solution(123456L));
  }

  public String solution(Long input) {
    if (String.valueOf(input).length() < 4) {
      return String.valueOf(input);
    }

    StringBuilder sb = new StringBuilder();

    String number = String.valueOf(input);

    int count = 1;
    for (int i = number.length() - 1; i >= 0; i--) {
      sb.append(number.charAt(i));
      if (count % 3 == 0 && i != 0) {
        sb.append(",");
      }
      count++;
    }

    return sb.reverse().toString();
  }

}

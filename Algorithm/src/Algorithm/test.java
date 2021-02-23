package Algorithm;


public class test {
    public static void main(String[] args) {
        System.out.println("occursNullPointerException() = " + occursNullPointerException());
    }

    public static Integer occursNullPointerException() {
        boolean check = false;
        Integer number1 = null;
        Integer number2 = check ? 0 : number1; // NPE
        return number2;
    }
}

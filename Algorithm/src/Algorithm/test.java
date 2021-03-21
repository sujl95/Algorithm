package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        // System.out.println("occursNullPointerException() = " + occursNullPointerException());
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.set(0, "d");
        System.out.println("list = " + list);
    }

    public static Integer occursNullPointerException() {
        boolean check = false;
        Integer number1 = null;
        Integer number2 = check ? 0 : number1; // NPE
        return number2;
    }
}

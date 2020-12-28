package Algorism;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        method(new int[]{1,2,3,4,5});
        method(1,2,3,4,5);
    }


    public static void method(int...numbers){
        System.out.println(Arrays.toString(numbers));
    }
}

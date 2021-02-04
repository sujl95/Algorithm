package Algorism;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        method(new int[]{1,2,3,4,5});
        method(1,2,3,4,5);

        String[] strings = new String[] {"GET", "POST", "PATCH"};

        String supportedMethods = Arrays.stream(Objects.requireNonNull(strings))
                .map(String::toString)
                .collect(Collectors.joining(", "));
        System.out.println("supportedMethods = " + supportedMethods);

    }


    public static void method(int...numbers){
        System.out.println(Arrays.toString(numbers));
    }
}

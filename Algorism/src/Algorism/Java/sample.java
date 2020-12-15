package Algorism.Java;


public class sample {
    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        System.out.println("스왑전 a = " + a + " b= " + b);
        swapTest(a,b);
        System.out.println("스왑후 a = " + a + " b= " + b);
    }

    public static void swapTest(int a , int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap a = " + a + " b= " + b);
    }
}

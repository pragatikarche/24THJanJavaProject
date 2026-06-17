package assignment2method;

public class SwapNo {
    static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swaping=");
        System.out.println("a="+a);
        System.out.println("b="+b);


        System.out.println("After swaping=");
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}

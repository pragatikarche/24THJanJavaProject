package variablrType;

public class D {

    public static void main(String[] args) {
        C c = new C();// created object of W (another) class
        //calling global variable from W class in V class using object reference
        int mul = C.a * 2;
        System.out.println(mul);
        //calling static global variable from W class in V class using class reference
        int div = 100 / C.b;
        System.out.println(div);
    }
}

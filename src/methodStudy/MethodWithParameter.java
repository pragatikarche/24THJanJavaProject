package methodStudy;

public class MethodWithParameter {
    public static void main(String[] args) {
        MethodWithParameter methodWithParameter = new MethodWithParameter();//create object with class
        methodWithParameter.addition();
        MethodWithParameter.addition(10, 22);
        MethodWithParameter.addotion(31);
    }

    public void addition()//Method without parameter this is non static method
    {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Addition of two number=" + sum);
    }

    public static void addition(int a, int b)//Method with two  parameter using  static method
    {
        int sum = a + b;
        System.out.println("Addition of two number=" + sum);
    }

    public static void addotion(int a)//Method with single parameter usings static method
    {
        int sum = 99 + a;
        System.out.println("Addition of this number=" + sum);
    }
}

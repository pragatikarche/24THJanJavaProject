package constructorchaining;

public class A {

    public A()
    {
        this(10);
        System.out.println("User drfined constuctor=");
    }
    private A(int a)
    {
        this("Automation tester");
        System.out.println("User defined with single parameter constuctor");
        System.out.println(a);
    }
    public A(String a)
    {
        this("Tester",11);
        System.out.println("User defined with single parameter constuctor");
        System.out.println(a);
    }
    public A(String a,int b)
    {
        System.out.println("User defined with two parameter constuctor");
        System.out.println(a);
    }

    public static void main(String[] args)
    {
        A a=new A();
    }
}


package constructorchaining;

public class B  extends A
{
    public B()
    {
        this("Mumbai");//calling same class constructor
        System.out.println("User defined without parameter constructor");
    }
    public B(String p)
    {
        super();//calling super class without parameter constructor
        System.out.println("User defined with parameter constructor");
        System.out.println(p);
    }
    public static void main(String[] args)
    {
        B b=new B();

    }
}


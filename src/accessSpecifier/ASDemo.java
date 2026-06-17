package accessSpecifier;

public class ASDemo
{
    private int a=10;
    int b=30;
    protected int c= 40;
    public int d=50;

    private void test()
    {
        System.out.println("This is privated");
    }
    void test2()
    {
        System.out.println("This is default");
    }
protected void test3()
    {
        System.out.println("This is protected");
    }
    public void test4()
    {
        System.out.println("This is public");
    }
    public static void main(String[] args)
    {
ASDemo a=new ASDemo();
a.test();// create an object of a class from within the same class,
a.test2();//call  method in same class
a.test3();//call  method in same class
a.test4();//call  method in same class
int sum1=a.a+10;//object.variable Name
        int sum2=a.b+10;//object.variable Name
        int sum3=a.c+10;//object.variable Name
        int sum4=a.d+10;//object.variable Name
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);

    }
}

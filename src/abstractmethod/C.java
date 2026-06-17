package abstractmethod;

public class C extends B
{
    public static void main(String[] args)
    {
        C c=new C();
        c.show1();
        c.show2();
        c.show3();
        c.show4();
        c.show5();

    }

    @Override
    public void show3() {
        System.out.println("Show3 method implement in c class=");
    }

    @Override
    public void show4()
    {
        System.out.println("Show4 method implement in c class=");
    }

    @Override
    public void show5()
    {
        System.out.println("Show5 method implement in c class=");

    }

}

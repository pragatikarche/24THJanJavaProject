package constructorStudy;

public class B {
    int a=10;//global variable define
    int b=20;//global variable define

    public static void main(String[] args) {
        B b = new B();
        b.add();
        B b1=new B(10,10);
       b1.add();
    }

    public void add() {
       int sum = a + b;
        System.out.println(" sum is=" + sum);
    }
    public B()
    {
        //System.out.p
    }
    public  B(int x,int z)
    {
        a=x;
        b=z;
        int sum=x+z;
        System.out.println("Sum is="+sum);
    }
}
    //public  B()
    //{
       // System.out.println("Default contructor");
    //}
    //public  B(int a,)


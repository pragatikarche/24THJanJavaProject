package thisandsuperkeyword;

public class B extends A

{
    public static void main(String[] args)
    {
        B b=new B();
        b.display();
        A a =new A();
        //a.display();
        a.display1();
    }
    public void  display1 ()

    {
        System.out.println("hi....");
    }

        int a = 99;//global variable
        public void display ()
        {
            int a = 110;
            int sum = a + 110;
            System.out.println(sum);

            int sum1 = this.a + 110;//global value of a
            System.out.println(sum1);

            int sum2 = super.a + 110;//global value of a
            System.out.println(sum2);
        }
    }


package variablrType;
//Program for use static variable

public class B {
    int a = 299;// global variable
    static int b;//static variable
    public static void main(String[] args)
    {
        B b =new B();
                b.add();

    }

    public void add() {
        int a = 10;//local variable
        int sum = a + 10;//use local value of a
        System.out.println(sum);

        int sum1 = this.a + 10;//use global value
        System.out.println(sum1);

        int sum2 = this.b + 10;//use static value
        System.out.println(sum2);
    }
    public static void sub()
    {
        int a=11;//local variable
        int b=12;
        int sub= a-10;
        System.out.println(sub);
         int sub1=B.b-10;// static method can be refer static variable
    //int sub2=this.a-10;//not allowed global variable

    }
}
//private int a;

//private int a;



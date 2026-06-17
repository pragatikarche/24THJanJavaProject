package assignment2method;
// Write a program to perform all arithmetic operations (+, -, *, /, %).
import abstractmethod.A;

// Write a program to perform all arithmetic operations (+, -, *, /, %).
public class ArithmaticOpration1
{
    static void main(String[] args) {
        ArithmaticOpration1 arithmaticOpration1=new ArithmaticOpration1();
        arithmaticOpration1.add(12,23);
        arithmaticOpration1.sub(25,20);
        arithmaticOpration1.mul(12,12);
        arithmaticOpration1.div(80,10);
    }
    void add(int a, int b)
    {
        int sum;
        sum=a+b;
        System.out.println("Sum of two number="+sum);

    }
    void sub (int a,int b)
    {
        int sub;
        sub=a-b;
        System.out.println("Substraction of two number="+sub);
    }
        void  mul(int a,int b)
        {
            int mul;
            mul=a*b;
            System.out.println("Multiplication of two number="+mul);

        }
        void  div(int a,int b)
        {
            int div;
            div=a/b;
            System.out.println("Division of two number="+div);
        }
}

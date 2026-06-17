package assignment2method;
//Write a program to demonstrate unary operators (++, --).
public class UnaryOperatior
{
    static void main(String[] args)
    {
        int a=10;
        //postincrement
        System.out.println("Post Increment(a++)"+(a++));
        System.out.println("Value of post a after post increment");
        //preincrement
        System.out.println("Pre-Increment(a++)"+(a++));

        //Postdecrement

        System.out.println("Post Decrement (a--)"+(a--));
        System.out.println("Value of pre a after pre decrement");

        System.out.println("Pre-decrement(--a)"+(--a));
    }
}

package exceptionStudy;

public class ExceptionEg2
{
    static void main(String[] args) {


      System.out.println("hello");
    //try
    //catch
        try
    {
        //risky code
        System.out.println(10/0);

    }
        catch (ArithmeticException e)
    {
        System.out.println("can't divided by zero");
    }

        System.out.println("hello");
}
}


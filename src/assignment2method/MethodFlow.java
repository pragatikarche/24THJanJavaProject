package assignment2method;
//. Write a program that demonstrates method calling flow (A → B → C → back to A).
public class MethodFlow
{
    static void main(String[] args)
    {
        System.out.println("Inside method A (main)");
        methodB();
        System.out.println("Back in  method A(main) ");
    }
   static void methodB()
    {
        System.out.println("Inside method B");
        methodC();
        System.out.println("Back in method B");

    }
   static void methodC()
    {
        System.out.println("Inside method C");
        System.out.println("back in method C");
    }
}

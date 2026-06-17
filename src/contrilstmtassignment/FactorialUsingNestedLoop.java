package contrilstmtassignment;
//44. Write a program to print the factorial of numbers 1 to 5 using nested loops.
public class FactorialUsingNestedLoop
{
    static void main(String[] args)
    {
        for (int i=1;i<=5;i++)
        {
            int fact=1;
            for (int j=1;j<=i;j++)
            {
                fact=fact*j;

            }
            System.out.println("factorial of "+i +" "+fact);

        }

    }
}

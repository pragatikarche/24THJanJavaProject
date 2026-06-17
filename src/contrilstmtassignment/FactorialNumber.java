package contrilstmtassignment;
// Write a program to calculate the factorial of a number using for loop.
import java.util.Scanner;

public class FactorialNumber
{
    static void main(String[] args)
    {
        //int firstno=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your factorial no=");
        int num= scanner.nextInt();


        int fact=1;

        for (int i=1;i<=num;i++)
        {
            fact=fact*i;

            System.out.println("Factorial Number="+fact);
        }

    }
}

package contrilstmtassignment;

import java.util.Scanner;

// 47.Write a program to count total even and odd digits in a given number.
public class EvenOddCount
{
    static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scanner.nextInt();

        int evencount=0;
        int oddcount=0;

        while (num!=0)
        {
            int digit = num % 10;
            if (digit %  2 == 0)
            {
                evencount++;
            }
            else
            {
                oddcount++;
            }
            num=num/10;
        }
        System.out.println("Total even digit="+evencount);
        System.out.println("Total odd digit="+oddcount);
    }
}

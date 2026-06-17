package logicalprogram;

import java.util.Scanner;

public class EvenOddNumber
{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number=");
        int number = scanner.nextInt();
        if (number==0)
        {
            System.out.println("Number can not define even or odd=");
        }
        else if (number%2==0)
        {
            System.out.println("Number is even=");
        }
        else
        {
            System.out.println("Number is odd=");
        }
    }
}

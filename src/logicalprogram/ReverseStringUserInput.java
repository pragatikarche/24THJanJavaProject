package logicalprogram;

import java.util.Scanner;

public class ReverseStringUserInput
{
    static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter string to be reversed=");
        String givenstring = scanner.next();
        String revers = "";
        for (int i = givenstring.length()-1;i >=0; i--)
        {
            char temp = givenstring.charAt(i);
            revers=revers+temp;
        }
        System.out.println("Given string is "+givenstring);
        System.out.println("Revers String is "+revers);
    }

}

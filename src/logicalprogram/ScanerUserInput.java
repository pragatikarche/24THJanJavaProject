package logicalprogram;

import java.util.Scanner;

public class ScanerUserInput
{
    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter Your name=");
         String name=scanner.next();
        System.out.println("Entered name is="+name);

        System.out.println("=================================");
        System.out.println("Please enter Your Roll number=");
        int roll = scanner.nextInt();
        System.out.println("Entered roll_no is="+ roll);
       // System.out.println("Please Enter your roll ni"+name);
        System.out.println("=================================");
        System.out.println("Please enter Your Marksr=");
        float mark = scanner.nextFloat();
        System.out.println("Entered Marks is="+ mark);


    }
}

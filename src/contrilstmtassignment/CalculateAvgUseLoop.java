package contrilstmtassignment;

import java.util.Scanner;

//Write a program to calculate the total marks and average of 5 subjects using for loop.
public class CalculateAvgUseLoop {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int mark = 0;


        for (int i = 1; i <= 5; i++)
        {
            System.out.println(" enter mark of subject=" + i + ":");
            mark = scanner.nextInt();
           total= total + mark;

        }
        double avg=total/5.0;
        System.out.println("Total mark="+total);
        System.out.println("Average of="+avg);
        scanner.close();
    }
}
package assignment2method;

import java.util.Scanner;

// Write a program that accepts two integers and prints their sum, difference, and product.
public class ArithmeticOperation
{
    //int a=10;
    //int b=20;
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Integer value a=");
        int a= sc.nextInt();

        System.out.println("Integer value b=");
        int b= sc.nextInt();

        int sum=a+b;
        int difference=a-b;
        int product=a*b;

        System.out.println("Sum="+sum);
        System.out.println("differance="+difference);
        System.out.println("Product="+product);
        sc.close();
    }

}

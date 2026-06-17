package assignment2method;
// Write a Java program that shows the difference between char and String.

public class CharvsString
{
    static void main(String[] args) {
        String name="Pragati";
        char ch='A';

        System.out.println("Name is="+name);
        System.out.println("Char is="+ch);

        System.out.println("Next character: " + (char)(ch + 1)); // char arithmetic
        System.out.println("Next character: " + (char)(ch + 2)); // char arithmetic
        System.out.println("String length: " + name.length());   // String method

        System.out.println("First character of String: " + name.charAt(0));
        System.out.println("First character of String: " + name.charAt(2));
        System.out.println("First character of String: " + name.charAt(3));
    }

}

package assignment2method;
//Write a program that prints student info using multiple parameters.
public class StudentInfo
{
    static void printStudent(String name, int age, String course, double marks) {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }

    static void main(String[] args) {
        printStudent("Rahul", 20, "Computer Science", 85.5);
    }
}

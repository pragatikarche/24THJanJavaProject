package contrilstmtassignment;
// 6. Write a program to display the grade of a student based on marks:
//>=90 → A+, >=75 → A, >=60 → B, >=40 → C, else Fail.
public class StudentGrade
{
    public static void main(String[] args)
    {
        int Mark = 97;
        if(Mark>=90)
        {
            System.out.println("Grade A+");
        }
        else if (Mark>=75)
        {
            System.out.println("Grade A");

        }
        else if (Mark>=60)
        {
            System.out.println("Grade B");
        }
        else if (Mark>=40)
        {
            System.out.println("Grade C");
        }
        else
            System.out.println("Fail");
    }
}

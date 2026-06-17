package contrilstmtassignment;
//9. Write a program to find whether a year is a leap year or not.
public class LeapYear
{
    public static void main(String[] args)
    {
        int year=2010;
        if (year%4==0)
        {
            if (year%100==0)
            {
                if (year%400==0)
                {
                    System.out.println("Leap year");
                }
                else {
                    System.out.println("Not Leap year");
                }
            }
            else {
                System.out.println("Leap year");
            }
        }
        else
        {
            System.out.println("Not Leap year");
        }
    }
}

package contrilstmtassignment;
//34. Write a program using nested for loops to print a hollow square pattern of 5×5 stars.
//        *****
//        *****
//        *****
//        *****
//        *****


public class Squar5BY5
{
    public static void main(String[] args)
    {
        int row=5;
        int col=5;
        for (int i = 1; i <= row; i++)
        {      // rows
            for (int j = 1; j <= col; j++)
            {  // columns
                System.out.print("*");
            }
            System.out.println(); // next line
        }
        }
    }


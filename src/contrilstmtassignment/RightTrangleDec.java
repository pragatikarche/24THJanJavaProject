package contrilstmtassignment;
//33. Write a program using nested for loops to print the following pattern:
//
//        *****
//        ****
//        ***
//        **
//        *

public class RightTrangleDec
{
    static void main(String[] args)
    {
        int row=5;
        int col=5;
        int star=5;
        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            star--;
        }

    }
}

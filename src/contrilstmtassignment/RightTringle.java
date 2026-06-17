package contrilstmtassignment;
// Write a program using nested for loops to print a right-angled triangle pattern of stars:
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

public class RightTringle
{
    static void main(String[] args) {
        int row=5;
        int col=5;
        int star=1;

        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=star;j++)
            {
                System.out.print("*");

            }
            System.out.println();
            star++;
        }
    }
}

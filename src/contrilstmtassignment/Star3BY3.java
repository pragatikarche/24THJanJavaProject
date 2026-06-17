package contrilstmtassignment;
//37. Write a program using nested for loops to print diagonal elements in a 3×3 matrix using *.
//        ***
//        ***
//        ***
public class Star3BY3 {
    public static void main(String[] args)
    {
        int row=3;
        int col=3;


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

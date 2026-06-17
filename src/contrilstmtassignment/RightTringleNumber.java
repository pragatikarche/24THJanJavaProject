package contrilstmtassignment;
//32. Write a program to print numbers in the same triangle pattern:
//
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

public class RightTringleNumber
{
    static void main(String[] args) {
        int row=5;
        int col=5;
        int num=1;
        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=num;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            num++;
        }
    }
}

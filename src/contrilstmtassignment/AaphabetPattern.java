package contrilstmtassignment;
//36. Write a program using nested for loops to print the following alphabet pattern:
//
//A
//A B
//A B C
//A B C D
//A B C D E
public class AaphabetPattern
{
    static void main(String[] args) {
        int row=5;
        int col=5;
        int alpha=1;
        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=alpha;j++)
            {
                System.out.print( (char)(64+j)+ "");
            }
            System.out.println();
            alpha++;
        }
    }
}


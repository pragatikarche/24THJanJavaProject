package Onlineexampgm4;

public class SameNoTranglePattern
{
    static void main(String[] args)
    {
        int row=5;
        int col=5;
        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=col;j++)
            {
                if (j<=i)
                {
                    System.out.print(i);
                }
               else
                {
                   System.out.println();

            }
            }
           // System.out.println();
        }
    }
}

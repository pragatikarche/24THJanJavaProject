package patternprogram;

public class Pattern2
{
   //     *
//        **
//        ***
//        ****
//        *****


    //row    col stars in 1st line space


    static void main(String[] args)
    {
        int row=5;
        int col=5;
        int star =1;

        for(int i=1;i<=row;i++)
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

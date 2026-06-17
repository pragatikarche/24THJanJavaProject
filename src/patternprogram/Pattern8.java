package patternprogram;

public class Pattern8
{//           *
//          * *
//         * * *
//        * * * *
//row   col  1st line space 1st line stars
static void main() {

    int row=4;
    int col=4;
    int star=1;
    int space=3;

    for (int i=1;i<=row;i++)
    {
        for (int j=1;j<=space;j++)
        {
            System.out.print(" ");
        }
        for (int k=1;k<=star;k++)
        {
            System.out.print("* ");
        }
        System.out.println();
        star++;
        space--;
    }
}
}

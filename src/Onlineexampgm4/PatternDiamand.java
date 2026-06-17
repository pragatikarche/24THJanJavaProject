package Onlineexampgm4;
//pgm for pattern diamand
public class PatternDiamand {
    static void main(String[] args) {
        int row = 5;
        int col = 5;
        int star = 1;
        int spac = 4;
        for (int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= star; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=row-1;i>=1;i--)
        {
            for (int j = 1; j <= star; j++)
            {
                System.out.print("*");
            }
            System.out.println();
           // Star++;
            //spac--;
        }

    }
}
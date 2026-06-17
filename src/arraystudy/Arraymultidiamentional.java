package arraystudy;

public class Arraymultidiamentional
{
    static void main(String[] args) {

        int Test[][]=new int [2][2]; // array dclaration

      //  array innitilization

        Test[0][0]= 5;
        Test[0][1]=10;
        Test[1][0]=15;
        Test[1][1]=20;

        for (int i=0;i<= Test.length-1;i++)
        {
            for (int j=0;j<=Test.length-1;j++)
            {
                System.out.print(Test[i][j] + " ");
            }
        }
       //System.out.println(Test[1][0]);

    }
}

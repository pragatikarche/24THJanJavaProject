package arraystudy;

public class ArrayChar
{
    static void main() {
        String subject[][]={{"Math","Eng","Sci","Evs","Marathi"}};
        for (int i=0;i<=subject.length-1;i++)
        {
            for (int j=0;j<=subject[i].length-1;j++)
            {
                System.out.print(subject[i][j] + "   ");
            }
            System.out.println();
        }

    }
}

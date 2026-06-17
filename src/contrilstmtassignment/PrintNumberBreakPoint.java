package contrilstmtassignment;
//38. Write a program to demonstrate the use of break in a loop (stop when number = 5).

public class PrintNumberBreakPoint
{
    static void main(String[] args)
    {

        for (int i=1;i<=10;i++)
        {
            if(i==5)
            {
               break;

            }
            System.out.println(i);
        }

    }
}

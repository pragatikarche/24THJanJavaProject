package contrilstmtassignment;
//22.Write a program to print all numbers between 1 and 100 divisible by both 2 and 7.


public class Divisible2by7
{
    static void main(String[] args)
    {
        for(int i=1;i<100;i++)
        {
            if(i%2==0 &&i%7==0)
            {
                System.out.println(i);
            }
        }

    }
}

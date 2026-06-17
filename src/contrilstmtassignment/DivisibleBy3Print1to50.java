package contrilstmtassignment;
//21. Write a program to find how many numbers between 1 and 50 are divisible by 3 and 5 using
//for loop.
public class DivisibleBy3Print1to50
{
    static void main(String[] args)
    {
        int count=0;
        for(int i=1;i<=50;i++)
        {
            if(i%3==0 && i%5==0)
            {
                count++;
            }

        }
        System.out.println("Count of number divisible by 3 and 5="+count);
    }
}

package contrilstmtassignment;
// Write a program to find the largest among three numbers using if-else-if.
public class LargestThreeNo
{
    public static void main(String[] args)
    {
        int a=10,b=80,c=30;
        if(a>b && a>c)

        {
            System.out.println(" largest no is="+a);
        }
        if(b>a && b>c)
        {
            System.out.println(" largest no is="+b);
        }
        else
            System.out.println(" largest no is="+c);

    }
}

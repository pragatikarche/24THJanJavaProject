package contrilstmtassignment;

public class FactorialNum
{
    public static void main(String[] args)
    {
        int num=4;
        int fact=1;
        for (int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.println("Favtorial of num="+num+"="+fact);
    }
}

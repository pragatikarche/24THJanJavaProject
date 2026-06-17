package contrilstmtassignment;
//. Write a program to check whether a number is prime or not using for loop.
public class PrimeNumber
{
    static void main(String[] args) {
        int no=9;
        int i=2;
        while (i<no)
        {
            if (no % i == 0)
            {
                System.out.println("Number is Not Prime ");
                return;
            }
            i++;
        }
        System.out.println("Number is prime");
    }

}

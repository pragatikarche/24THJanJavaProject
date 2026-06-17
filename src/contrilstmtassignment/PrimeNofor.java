package contrilstmtassignment;
//. Write a program to check whether a number is prime or not using for loop.
public class PrimeNofor
{
    static void main(String[] args)
    {
            int no = 9;

            for (int i = 2; i < no; i++)
            {
                if (no % i == 0)
                {
                    System.out.println("Number is Not Prime");
                    return;
                }
            }

            System.out.println("Number is Prime");
        }
    }



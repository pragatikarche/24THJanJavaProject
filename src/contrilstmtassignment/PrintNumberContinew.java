package contrilstmtassignment;
//Write a program to demonstrate the use of continue in a loop (skip number 5).
public class PrintNumberContinew
{
    static void main(String[] args) {
        for (int i = 10; i <= 10; i++)
        {
            if (i==5)
            {
                continue;//skip one value and continue
            }
            System.out.println(i);
        }


    }
}

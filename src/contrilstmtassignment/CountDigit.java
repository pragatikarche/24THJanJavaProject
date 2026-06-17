package contrilstmtassignment;
//Write a program to count the number of digits in a number using while loop.
public class CountDigit
{
    static void main(String[] args) {
        int num=12345;
        int count=0;
        while (num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println("Count digit="+count);
    }
}

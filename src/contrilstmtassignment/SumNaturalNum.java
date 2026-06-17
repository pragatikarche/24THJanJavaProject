package contrilstmtassignment;
//17. Write a program to calculate the sum of first 10 natural numbers using while loop.
public class SumNaturalNum
{
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 10){
            sum += i;
            i++;
    }
        System.out.println("sum of first 10 number="+sum);
    }
}

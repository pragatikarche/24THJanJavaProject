package contrilstmtassignment;
//write a program for fibonacci series
public class FibbonaciesSeries
{
    static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;

        System.out.println("Fibonacci series="+a  +" "+b);

        for (int i=0;i<=n;i++)//01
        {
            int c=a+b;//0+1
            System.out.print(" "+c);
            a=b;//0=1
            b=c;//1=2
        }
    }
}

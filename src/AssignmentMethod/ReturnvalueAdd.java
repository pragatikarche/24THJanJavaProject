package AssignmentMethod;
//Write a program with a method that returns a value (like a sum or average).
//mport static variablrType.C.a;

public class ReturnvalueAdd
{
    int getsum(int a,int b)
    {
        return a+b;
    }
    double getavg(int a,int b)
    {
        return  a+b/2.0;
    }

     public static void main(String[] args)
     {
        ReturnvalueAdd returnvalueAdd=new ReturnvalueAdd();
        int sum =returnvalueAdd.getsum(10,23);
        double avg=returnvalueAdd.getavg(56,32);

        System.out.println("Addition of Two number="+sum);
        System.out.println("Average of Two Number="+avg);
    }
}

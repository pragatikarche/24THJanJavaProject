package AssignmentMethod;
//21. Write a program to demonstrate parameterized methods by adding two numbers
public class AdditionMethod
{
    void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition of two number="+c);
    }

    static void main() {
        AdditionMethod additionMethod=new AdditionMethod();
        additionMethod.add(18,44);
    }
}

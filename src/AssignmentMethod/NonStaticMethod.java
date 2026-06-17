package AssignmentMethod;
//Write a program with a non-static method that prints your roll number and call it using an
//object.
public class NonStaticMethod
{
    void  data()
    {
        int rollNo=10;
        System.out.println("Roll no is="+rollNo);
    }

    static void main() {
        NonStaticMethod nonStaticMethod=new NonStaticMethod();
        nonStaticMethod.data();
    }
}

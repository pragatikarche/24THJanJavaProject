package AssignmentMethod;

public class InsideMethodCall
{
    void display()
    {
        System.out.println("Inside Method call display");
    }
    void show()
    {
        System.out.println("Inside Method call show");
         display();
    }

    static void main() {
        InsideMethodCall insideMethodCall=new InsideMethodCall();
        insideMethodCall.display();
        insideMethodCall.show();
    }
}

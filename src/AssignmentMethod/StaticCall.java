package AssignmentMethod;
//. Write a program with a static method that prints your name and call it from main().
public class StaticCall
{
    static void  printname()
{
    System.out.println("My Name is Pragati");
}

    static void main(String[] args) {
        StaticCall staticCall=new StaticCall();
        printname();

    }
}

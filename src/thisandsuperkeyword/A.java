package thisandsuperkeyword;

public class A
{
    int a=100;//Global variable
    public void display()
    {
        int a = 10;//Local variable
        int sum = a + 11;
        int sum1 = this.a + 11;

    }

   protected void display1() {
    }
}

package methodStudy;

public class MathOperation
{
    public static void main(String[] args)
    {
        //call static metod in same class

        sub();
        // call non static method in same class
        MathOperation mathOperation = new MathOperation();
        mathOperation.add();
        //call non static method in another class

        MathOperation2 mathOperation2 = new MathOperation2();
        mathOperation2.mul();
        //call non static method in another class********************************************************************************

        mathOperation2.div();
    }
        public void add ()
        {
            int a = 10;//veriable declaration and assign
            int b = 22;
            int sum = a + b;
            System.out.println("Addition of two nummber=" + sum);
        }

        public static void sub () {
            int p = 29;
            int q = 8;
            int sub = p - q;
            System.out.println("Substraction of two number=" + sub);
        }


}

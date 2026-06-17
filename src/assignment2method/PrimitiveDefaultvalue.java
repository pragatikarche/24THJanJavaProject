package assignment2method;
//Write a program to display the default values of instance variables of all primitive types.
public class PrimitiveDefaultvalue {



        int a;
        byte b;
        float c;
        double d;
        short e;
        long f;
        char g;
        boolean h;


        void Display() {
            System.out.println("Integer value=" + a);
            System.out.println("byte value=" + b);
            System.out.println("float value=" + c);
            System.out.println("double value=" + d);
            System.out.println("short value=" + e);
            System.out.println("Long value=" + f);
            System.out.println("char value=" + g);
            System.out.println("boolen value=" + h);
        }


    static void main(String[] args) {
            PrimitiveDefaultvalue primitiveDefaultvalue=new PrimitiveDefaultvalue();
            primitiveDefaultvalue.Display();
    }
    }


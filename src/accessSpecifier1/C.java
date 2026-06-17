package accessSpecifier1;
//import accessSpecifier1.ASDemo;

import accessSpecifier.ASDemo;

public class C extends ASDemo
{
    public static void main(String[] args)
    {
        ASDemo a=new ASDemo();
        a.test4();
       // a.
        C c=new C();
        c.test3();
        c.test4();//public class
    }
}

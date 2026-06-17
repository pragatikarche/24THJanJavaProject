package methodStudy;

public class Methodpgm
{
    public static void main(String[] args) {
        test();
        test1();
        Methodpgm m=new Methodpgm();
        m.test2();
        Methopgm2 m1=new Methopgm2();
        m1.test4();//to create object from different class use for satic method
        Methopgm2.test3();//to take class name dot method name for non sttaic metho and different class

    }
        public static void test()
        {
                    test1();

            System.out.println("This is static method");

      }
        public static void test1()

        {
            System.out.println("This is static method one");
        }
        public void test2()
        {
            test1();
            test();
            test2();
            System.out.println("This is non-static method");
        }
    }


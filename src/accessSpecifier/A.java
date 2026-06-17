package accessSpecifier;

public class A
{

        void show() {
            System.out.print("A ");
        }
    }

    class D extends A {
        void display() {
            System.out.print("d");
        }
    }

     class Test {
        public static void main(String[] args) {
            D obj = new D();
            obj.show();
            obj.display();
        }
    }

package exceptionStudy;

public class ExceptionEg6
{
    static void main(String[] args) {
        String a = null;
        try {
            System.out.println(a.length());
        } finally {
            System.out.println("finally block executed");
        }
        System.out.println("end of code");

    }
}

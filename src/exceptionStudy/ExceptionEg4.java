package exceptionStudy;

public class ExceptionEg4 {
    static void main(String[] args) {
        String a = "pune";
        try {
            System.out.println(a.charAt(-1));
        } catch (Exception e) {
            System.out.println("something went wrong");
        }


    }
}
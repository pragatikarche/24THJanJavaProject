package exceptionStudy;

public class ExceptionEg3 {
    static void main(String[] args) {
        System.out.println("Hello All");
        String s = "test";//"test";
        try {
            System.out.println(s.charAt(12));
        } catch (NullPointerException e) {
            System.out.println("object can not null");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("checkIndex");
        }
        System.out.println("goodnight");
    }
}

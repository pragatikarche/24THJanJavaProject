package controlStatment;

public class SimpleIf {
    public static void main(String[] args) {
        int num = 20;
        if (num > 10) {
            System.out.println("Number is greter than 10");
        }
        if (num < 30) {
            System.out.println("Number is Less than 30");
        }
        if (num == 20) {
            System.out.println("Number is Equal");
        }
        if (num != 10) {
            System.out.println("Number is not Eual to");
        }
        char div = 'A';
        if (div == 'A') {
            System.out.println("Your Marks Above 90");
        }
        String grade = "Pass";

        if ("grade" == "pass") {
            System.out.println("You are go to the next class");
        }
        //if ("grade" != "Fail") {
            //System.out.println("You are faill");
        //}
    }
}

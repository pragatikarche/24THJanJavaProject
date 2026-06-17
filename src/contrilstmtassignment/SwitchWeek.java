package contrilstmtassignment;
//7. Write a program using switch statement to print the day of the week (1 = Monday ... 7 =
//Sunday).
public class SwitchWeek {
    public static void main(String[] args) {
        //int 5;
        int week = 6;
        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wendesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Firday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Plese enter correct days");

        }
    }
}


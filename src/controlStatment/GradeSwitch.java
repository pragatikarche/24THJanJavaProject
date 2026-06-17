package controlStatment;

public class GradeSwitch {
    public static void main(String[] args) {
        char grade ='D';
      switch (grade)
      {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C' :
                System.out.println("Average");
                break;
            case  'D':
                System.out.println("poor");
                break;
            case  'E':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}

package patternprogram;

public class Pattern1 {
    //   *****
//        *****
//        *****
    //row     columns   stars in 1st line  space

    static void main(String[] args) {
        int row = 3;
        int col = 5;
        for (int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= col; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
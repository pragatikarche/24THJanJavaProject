package contrilstmtassignment;

public class Matrix3By3
{
        public static void main(String[] args) {

            int size = 3;

            for (int i = 0; i < size; i++) {        // rows
                for (int j = 0; j < size; j++) {    // columns

                    if (i == j) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

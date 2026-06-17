package logicalprogram;

import java.util.Scanner;

public class CountAndRemoveVowels {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your name ");
        String givenstring = scanner.next();
        String givenstring1 = givenstring.toLowerCase();
        String output = " ";
        int count = 0;
        for (int i = 0; i <= givenstring.length() - 1; i++) {
            char temp = givenstring1.charAt(i);

            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                count++;
                System.out.println("Vovel is found=" + temp);
            }


            output=output + temp;
            continue;
        }

        System.out.println("String with out vovel is="+output);
        System.out.println("No of vovel string arre ="+count);

    }

}

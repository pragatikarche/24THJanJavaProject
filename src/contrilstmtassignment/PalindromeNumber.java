package contrilstmtassignment;
//48. Write a program to check whether a given string is palindrome using loops.
public class PalindromeNumber
{
    public static void main(String[] args)
    {
        String str= "Madam";
        String rev="";
        for (int i=str.length()-1;i>=0;i--)
        {
            rev= rev + str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("String is not Palindrom");
        }


    }

//    String str = "Madam";
//    String rev = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//    rev = rev + str.charAt(i);
//}
//
//        if (str.equalsIgnoreCase(rev)) {
//    System.out.println("Palindrome String");
//} else {
//    System.out.println("String is not Palindrome");
//}
//}
}

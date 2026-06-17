package stringstudy;

import java.util.Locale;

public class StringPalandrom
{

        public static void main(String[] args)
        {
            String str= "mom";
            String rev="";
            String S =str.toLowerCase();
            for (int i=S.length()-1;i>=0;i--)
            {
                 char temp= S.charAt(i);
                rev=rev+temp;

            }
            System.out.println("Given string is ="+S);
            System.out.println("Reverse String is =" + rev);



            if(S.equals(rev))
            {
                System.out.println("Palindrome String");
            }
            else
            {
                System.out.println("String is not Palindrom");
            }


        }


}

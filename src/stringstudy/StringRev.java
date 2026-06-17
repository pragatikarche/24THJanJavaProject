package stringstudy;

public class StringRev
{
    public static void main(String[] args)
    {
        String str="Pragati";
        String rev="";
        for (int i = str.length()-1; i>=0; i--)
        {
            char c =  str.charAt(i);
            rev = rev+c;//""+"i"
            //i+t
            //it

        }
        System.out.println(rev);

    }
}

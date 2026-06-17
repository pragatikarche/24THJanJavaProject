package Onlineexampgm4;
//proram for count vovel number
public class VowelsString
{
    static void main(String[] args)
    {
        String str="Automation";
        int count=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
           char ch=str.charAt(i);
           if(ch=='a' || ch=='e' || ch=='i' ||ch=='o'|| ch=='u')
           {
               count++;
           }

        }
        System.out.println("Number of count="+count);

    }
}

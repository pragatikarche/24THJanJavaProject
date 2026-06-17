package arraystudy;

import java.util.Arrays;

public class Arraysimpleno
{
    private static Object roll_no;

    public static void main(String[] args)
    {
        int roll_no[]= {11,44,33,22,66,55,10};
        System.out.println("================================");

        for(int i=0;i<= roll_no.length-1;i++)
                {
                    System.out.println(roll_no[i]);
                }
        System.out.println("================================");
        Arrays.sort(roll_no);
        for(int i=0;i<= roll_no.length-1;i++)
        {
            System.out.println(roll_no[i]);
        }
        System.out.println("================================");


                for(int i= roll_no.length-1;i>=0;i--)
                {
                    System.out.println(roll_no[i]);
                }
                }
    }


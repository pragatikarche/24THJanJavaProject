package arraystudy;

import java.util.Arrays;

public class AnagramString
{
    public static void main(String[] args)
    {
        String str="Java";
        String str1="avaj";
// first convert string to array then perform operation
        char[] arr=str.toCharArray();
        char[] arr1=str1.toCharArray();
// then sort array using array sort method
        Arrays.sort(arr);
        Arrays.sort(arr1);
//then compare both array
        if (Arrays.equals(arr, arr1))
        {
            System.out.println("String is not anagram");
        } else {
            System.out.println("String is anagram");
        }

    }
}

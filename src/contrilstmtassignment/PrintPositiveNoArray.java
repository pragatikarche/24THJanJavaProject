package contrilstmtassignment;
//45. Write a program to find and print only positive numbers from an array of integers.
public class PrintPositiveNoArray
{
    static void main(String[] args)
    {
        int arr[]={10,-5,9,-7,1,-11,85};
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>0)
            {
                System.out.println(arr[i] + " ");
            }
        }

    }
}

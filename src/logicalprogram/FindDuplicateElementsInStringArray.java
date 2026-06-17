package logicalprogram;

public class FindDuplicateElementsInStringArray
{
    static void main(String[] args)
    {
        String arr[] = {"java", "data", "oop", "java", "math", "data"};
        int count=0;
        for (int i=0; i<=arr.length-1; i++)
        {
            for (int j=i+1; j<=arr.length-1; j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    System.out.println("Duplicate are found="+arr[i]);
                    count++;
                }

            }

        }
        System.out.println("Duplicate count is="+count);
    }
}

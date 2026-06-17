package logicalprogram;

public class FindDuplicateElementsInIntArray {
    static void main(String[] args) {
        int arr[]={1,3,4,2,6,5,3,2,2,7,1};
        int count=0;
        for (int i=0;i<=arr.length-1;i++)
        {
            for (int j=i+1;j<=arr.length-1;j++)
            {
                if (arr[i]==arr[j]) {
                    System.out.println("Duplicate are found" + arr[i]);

                    count++;
                }
            }
        }
        System.out.println("Total duplicate are="+count);
    }
}

package Onlineexampgm4;
//program for remove duplicate from array
public class DuplicateNoRemove
{
    static void main(String[] args)
    {
        int arr[]={1,2,2,3,3};
        for (int i=0;i<arr.length-1;i++)
        {
          if (arr[i]!=arr[i+1])
          {
              System.out.println(arr[i]);
          }
        }
        System.out.println(arr[arr.length-1]);
    }
}

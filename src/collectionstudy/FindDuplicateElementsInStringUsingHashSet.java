package collectionstudy;

import java.util.HashSet;

public class FindDuplicateElementsInStringUsingHashSet
{
    static void main(String[] args)
    {
    String arr[]={"java","data","data","das","auto","das","oop"}  ;
        HashSet<String> hashSet=new HashSet<>();
        HashSet<String> duplicate=new HashSet<>();
        for (String value :arr)
        {
            if (!hashSet.add(value))
            {
                duplicate.add(value);
            }
        }
        System.out.println("Duplicates are: " + duplicate);
        System.out.println("Duplicate count is: " + duplicate.size());
    }
}

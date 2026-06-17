package collectionstudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class ArrayListMethod
{
    static void main(String[] args)
    {
       ArrayList<Integer> arrayList = new ArrayList<>();

        boolean result = arrayList.add(98);
        System.out.println("Element add status is= " + result);
        arrayList.add(91);
        arrayList.add(89);
        System.out.println(arrayList);
        arrayList.add(2,200);

        System.out.println(arrayList);
        arrayList.addLast(65);

        System.out.println(arrayList);
        arrayList.addFirst(45);

        System.out.println(arrayList);

        System.out.println("========================================");
        //arrayList.clear();
    //System.out.println(arrayList);
        Object arrylistcloned = arrayList.clone();
        System.out.println("arraylistcloned-->"+arrylistcloned);

        System.out.println("arraylist-->"+arrayList);

        arrayList.add(22);

        System.out.println("arraylist---->"+ arrayList);

       boolean result1 =arrayList.equals(arrylistcloned);
       arrayList.equals(arrylistcloned);
       System.out.println("equal result is ="+result1);

       boolean result2=arrayList.equals(arrylistcloned);
       arrayList.equals(arrylistcloned);
        System.out.println("equal result is ="+result2);

        int myElement=arrayList.get(2);
        System.out.println(myElement);
        System.out.println(arrayList.getFirst());

        System.out.println(arrayList.getLast());

         int indexOfText=arrayList.indexOf(2);
         System.out.println(indexOfText);

         System.out.println(arrayList);

          int sizeOfArrayList=arrayList.size();
          System.out.println("Size of array list= " + arrayList);

          System.out.println("========================================");

          System.out.println(arrayList);

          Integer removeElement = arrayList.remove(2);
          System.out.println(removeElement);
          System.out.println(arrayList);

          arrayList.removeFirst();
          arrayList.removeLast();

          System.out.println(arrayList);
          arrayList.set(3 ,91);
          System.out.println(arrayList);








        //= arrayList.indexOf(2);



    }
}

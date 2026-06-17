package collectionstudy;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(98);
        linkedHashSet.add(85);
        linkedHashSet.add(89);
        linkedHashSet.add(74);
        linkedHashSet.add(12);
        linkedHashSet.add(78);
        linkedHashSet.add(12);
        System.out.println(linkedHashSet);
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);
        // System.out.println(linkedHashSet.size());
        // LinkedHashSet.addlast(48);
        System.out.println("==================================");
        linkedHashSet.addAll(Collections.singleton(42));
        linkedHashSet.addFirst(70);
       linkedHashSet.addFirst(65);
        System.out.println(linkedHashSet);
        System.out.println("==================================");
        System.out.println(linkedHashSet.size());
        linkedHashSet.getFirst();
        linkedHashSet.getLast();
        System.out.println(linkedHashSet);
       linkedHashSet.removeFirst();
        linkedHashSet.removeLast();
        linkedHashSet.remove(42);
        System.out.println(linkedHashSet);
        linkedHashSet.clone();

        for (Integer I : linkedHashSet) {
            System.out.println(I);
        }
        System.out.println("==================================");
        //  LinkedHashSet<Iterator> it=new LinkedHashSet<Iterator>() ;
        // while (it.hasNext()) {
        //   System.out.println(it.next());
        //  }


    }
}

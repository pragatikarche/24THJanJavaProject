package collectionstudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import static java.util.Vector.*;

public class VectorAssignment
{
    static void main(String[] args)
    {
        Vector<Object> vector = new Vector<>();
        vector.add(100);
        vector.add("Pragati");
        vector.add("Mumbai");
        vector.add(78);
        vector.add(120);
        vector.add(true);
        vector.add('V');
        System.out.println(vector);
        System.out.println("==========Using for loop===========");
        for(int i=0;i<=vector.size()-1;i++)
        {
            System.out.println(vector.get(i));
        }

        System.out.println("==========Using for each===========");

        for (Object tv:vector)
        {
            System.out.println(tv);
        }
        System.out.println("==========Iterator===========");
        Iterator<Object> itr=vector.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("==========ListIterator===========");

       ListIterator <Object> litr =vector.listIterator();
       while (litr.hasNext()) {
           System.out.println(litr.next());

       }

        System.out.println("==========ListIteratorReverse===========");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
        System.out.println("==========Enumeration===========");
        Enumeration<Object> ele= vector.elements();
        while (ele.hasMoreElements())
        {
            System.out.println(ele.nextElement());
        }

    }
}

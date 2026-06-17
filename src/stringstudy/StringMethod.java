package stringstudy;

public class StringMethod {
    public static void main(String[] args) {
        String a = "Pragti";
       System.out.println(a.length());
      int StringLength = a.length();
      System.out.println("Length of string is=" +StringLength);
       System.out.println("=======================================");
       String a1="";
       System.out.println(a1.length());
       System.out.println(a.toUpperCase());
       // System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());

        System.out.println("=======================================");
        String s1="Mumbai";
        String s2="Mumbai";
        String s3= new String("Mumbai");
        String s4= new String("mumbai");
        System.out.println(a.concat(s2));

        System.out.println(s1==s2);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s3));

        System.out.println("=======================================");
        String C1="Pragati Karche";
        boolean result =C1.contains("Karche");
        System.out.println(result);
       // System.out.println(s1.contains(s2));
        // String C2="";
    System.out.println(C1.contains(" "));
        System.out.println("=======================================");

        String d="";
        String d1="pk";
       // String d2= null;
        String d3="hdfhf";

        System.out.println(d.isEmpty());
        System.out.println(d3.isEmpty());
        //System.out.println(d2.isEmpty());
        System.out.println(d3.isBlank());


        System.out.println("=======================================");

        String e="Automaton Tester";
        System.out.println(e.charAt(8));
        System.out.println(e.charAt(12));

        System.out.println("=======================================");

        String f1 = "Selenium";

        System.out.println(f1.endsWith("m"));
        System.out.println(f1.endsWith("elenium"));
        System.out.println(f1.endsWith("ni"));

        System.out.println("=======================================");

        System.out.println(f1.startsWith("Sel"));
        System.out.println(f1.startsWith("el"));

        System.out.println("=======================================");
String g ="Full Stack Software Testing With Automation Testing";
String g1=g.substring(12);
System.out.println(g1);
       String g2=g.substring(15,30);
        System.out.println(g2);
        System.out.println("=======================================");

        String h1="Java";
        String h2="Testing";


        String h3 = h1.concat(h2);
        System.out.println(h3);


        System.out.println(h1.concat(" ").concat(h2));
        System.out.println(h1.concat(" ").concat("Selenium ").concat(h2));

        System.out.println("=======================================");


        String i="Prgati";
        String i1="My name is pragtai Hipparkar";

        System.out.println(i.replace('P','H'));
        System.out.println(i1.replace("Hipparkar","Karche"));

        System.out.println("=======================================");
        String k1=" Dhan  anjay ";
        System.out.println(k1.trim());

        System.out.println("=======================================");
        String i11="Enginerring";
        int index = i11.indexOf('i');
        System.out.println(index);
        System.out.println(i11.indexOf(i,3));
        System.out.println(i11.indexOf(i,9));

    }
}

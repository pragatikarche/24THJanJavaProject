package interfacestudy;

public interface Father
{

    void hardwork();
    void honesty();
    default void Love()
    {
        System.out.println("Fathers Love");
    }
    static void kindness()
    {
        System.out.println("Fathers kindness");
    }


}

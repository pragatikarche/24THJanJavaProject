package interfacestudy;

public interface Mother {
    void nature();
    void look();
    default void Love()
    {
        System.out.println("Mothers Love");
    }
    static void kindness()
    {
        System.out.println("Mother kindness");
    }

}

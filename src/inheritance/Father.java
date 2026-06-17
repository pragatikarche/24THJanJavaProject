package inheritance;
class Father
{
    void money()
    {
        System.out.println("Father has money");
    }

    void car()
    {
        System.out.println("Father has a car");
    }
}
class Mother extends Father
{
    void nature()
    {
        System.out.println("Mother Nature");
    }
    static void hairclolor()
    {
        System.out.println("haircolor");
    }
}

class Son extends Mother
{
    void mobile()
    {
        System.out.println("Son has a mobile");
    }

    public static void main(String[] args)
    {
        Son s = new Son();

        s.mobile();   // Child class method
        s.money();    // Parent class method
        s.car();// Parent class method
        s.nature();
        Son.hairclolor();
    }
}
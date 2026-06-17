package methodStudy;

public class StaticMethod1 {
    public static void main(String[] args) {
        System.out.println("This is Main Method=");
        a();
        StaticMethod2.b();
        StaticMethod2.c();
       // StaticMethod2.a();
    }

    public static void a() {
        System.out.println("Static regular method =");
    }
}

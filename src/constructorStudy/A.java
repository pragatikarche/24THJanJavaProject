package constructorStudy;

public class A {


public  A()
{
    System.out.println("User defined constuctor with zero parameter");
}
public A(int a)
{
    System.out.println("User defined constuctor with one  parameter");
}

public void main(String[] args) {

    A a = new A();
    A a1 = new A(2);

}
}
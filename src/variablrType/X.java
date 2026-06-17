public  class X {
    int a = 100;   //global variable
    int b = 88;

    void display() {
        int a = 40; //local variable
        int sum = a + b;//use to local value of a
        System.out.println("Sum is=" + sum);
        int sum1 = this.a + b;//calling global value of a
        System.out.println("Sum is=" + sum1);
        int c = 90;
        System.out.println("value c is=" + sum);

    }

    public static void main(String[] args) {
        X x = new X();
        x.display();


    }
}


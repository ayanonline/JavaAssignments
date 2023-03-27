class A {
    void display() {
        System.out.println("method of A class");
    }
}

class B extends A {
    void display() {
        super.display();
        System.out.println("method of B class");
    }
}

public class Question6 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}

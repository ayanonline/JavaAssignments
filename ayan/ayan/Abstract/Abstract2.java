abstract class A {
    abstract void show();

    void display() {
        System.out.println("A");
    }
}

class B extends A {
    void show() {
        System.out.println("B");
    }
}

public class Abstract2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
    }
}

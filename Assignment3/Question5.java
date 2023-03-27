class A {
    void display() {
        System.out.println("method of A class");
    }
}

class B extends A {
    void display() {
        System.out.println("method of B class");
    }
}

public class Question5 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
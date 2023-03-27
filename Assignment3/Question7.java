class A {
    A() {
        this(5);
        System.out.println("hello");
    }

    A(int a) {
        System.out.println(a);
    }
}

public class Question7 {
    public static void main(String[] args) {
        A obj = new A();
    }
}

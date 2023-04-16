class A {
    void show() {
        System.out.println("A class");
    }
}

interface B {
    void show();
}

class C extends A implements B {
    public void show() {
        super.show();
        System.out.println("C class");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}

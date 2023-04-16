abstract class A {
    A(int n) {
        System.out.println(n);
    }
}

class B extends A {
    B(float f, int n) {
        super(n);
        System.out.println(f);
    }
}

class Abstract1 {
    public static void main(String[] args) {
        B obj = new B(6.5f, 10);
    }
}
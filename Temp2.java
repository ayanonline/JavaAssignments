class A {
    A(int a) {
        System.out.println(a);
    }
}

class B extends A {
    B(float b, int a) {
        super(a);
        System.out.println(b);
    }
}

class C extends B {
    C(String s, float b, int a) {
        super(b, a);
        System.out.println(s);
    }
}

public class Temp2 {
    public static void main(String[] args) {
        C obj = new C("kolkata", 4.5f, 10);
    }
}

// output
// 10
// 4.5
// kolkata
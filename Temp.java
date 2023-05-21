class A {
    int l = 10;
}

class B extends A {
    int b = 6;

    int calculateArea() {
        int area = l * b;
        return area;
    }
}

public class Temp {
    public static void main(String[] args) {
        B obj = new B();
        int result = obj.calculateArea();
        System.out.println(result);
    }
}

// class C extends B {
// int calculateArea() {
// int area = l * b;
// return area;
// }
// }
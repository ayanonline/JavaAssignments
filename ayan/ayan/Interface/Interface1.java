interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("Interface method");
    }

    void display() {
        System.out.println("B class");
    }
}

class Interface1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
    }
}
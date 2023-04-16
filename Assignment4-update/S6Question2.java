abstract class Fruit {
    abstract void test();
}

public class S6Question2 extends Fruit {
    void test() {
        System.out.println("Sweet test");
    }

    public static void main(String[] args) {
        // Fruit obj1v = new Fruit(); // Fruit is abstract; cannot be instantiated
        S6Question2 obj = new S6Question2();
        obj.test();
    }
}
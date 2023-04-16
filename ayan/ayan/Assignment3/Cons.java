public class Cons {
    Cons() {
        System.out.println("Deafult Constructor");
    }

    Cons(int a) {
        System.out.println("VALUE OF A: " + a);
    }

    public static void name(String[] args) {
        Cons cs = new Cons();
        Cons cs1 = new Cons(22);
    }
}
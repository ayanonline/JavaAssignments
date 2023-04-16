class invalid extends Exception {
    invalid(String s) {
        super(s);
    }
}

/**
 * Temp
 */
public class Temp {

    static void validate(int a) throws invalid {
        if (a < 18) {
            throw new invalid("Not valid");
        } else {
            System.out.println("Welcome");
        }
    }

    public static void main(String[] args) {
        Temp obj = new Temp();
        try {
            obj.validate(21);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
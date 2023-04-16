public class Question9 {
    int i;

    void divisibleBy3() {
        System.out.println("Divisble by 3 numbers are");
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    void divisibleBy5() {
        System.out.println("Divisible by 5 numbers are");
        for (i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    void divisibleBy3_5() {
        System.out.println("Divisible by 3 and 5 numbers are");
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

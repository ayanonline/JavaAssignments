
public class Question1 {

    int sum, mul, subs, rem;
    float divide;

    void sum(int a, int b) {
        sum = a + b;
        System.out.println("Sum of " + a + " " + b + " is " + sum);
    }

    void multi(int a, int b) {
        mul = a * b;
        System.out.println("Multiply of " + a + " " + b + " is " + mul);
    }

    void subs(int a, int b) {
        subs = a - b;
        System.out.println("Substraction of " + a + " " + b + " is " + subs);
    }

    void div(int a, int b) {
        divide = a / b;
        System.out.println("Division of " + a + " " + b + " is " + divide);
    }

    void remain(int a, int b) {
        rem = a % b;
        System.out.println("Remainder of " + a + " " + b + " is " + rem);
    }
}
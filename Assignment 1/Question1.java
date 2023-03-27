
// Question 1
import java.util.Scanner;

class InnerQuestion1 {
    int age;

    void checkAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age? ");
        age = sc.nextInt();
        if (age < 18) {
            System.out.println("Age is less than 18");
        } else {
            System.out.println("Aage is greater than 18");
        }
    }
}

class Question1 {
    public static void main(String[] args) {
        InnerQuestion1 obj = new InnerQuestion1();
        obj.checkAge();
    }
}
import java.util.Scanner;

public class Question8 {
    int num;

    void checkEvenOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

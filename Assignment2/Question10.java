import java.util.Scanner;

public class Question10 {
    int first, second, third;

    boolean checkSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer");
        first = sc.nextInt();
        System.out.println("Enter the second integer");
        second = sc.nextInt();
        System.out.println("Enter the third integer");
        third = sc.nextInt();

        if (first + second == third) {
            return true;
        } else {
            return false;
        }
    }
}

import java.util.Scanner;

/**
 * Question4
 */
public class Question4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("It is zero");
        } else if (num < 0) {
            System.out.println("It is a negative number");
        } else if (num > 0) {
            System.out.println("It is a positive number");
        }
    }
}
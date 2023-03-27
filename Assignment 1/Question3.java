import java.util.Scanner;

/**
 * Question3
 */
public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks :");
        int marks = sc.nextInt();
        if (marks < 40) {
            System.out.println("Fail");
        } else if (marks >= 40 && marks < 50) {
            System.out.println("C");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("B");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("A");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("A+");
        }
    }
}
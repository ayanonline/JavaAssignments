import java.util.Scanner;

public class Question3 {
    int num1, num2, num3;
    float avg;
    Scanner sc = new Scanner(System.in);

    void calcAverage() {
        System.out.println("Enter first number ");
        num1 = sc.nextInt();
        System.out.println("Enter second number ");
        num2 = sc.nextInt();
        System.out.println("Enter third number ");
        num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        avg = (float) sum / 3; // here 3 is no of numbers
        System.out.println("Average " + avg);
    }
}

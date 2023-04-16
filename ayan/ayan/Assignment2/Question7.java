import java.util.Scanner;

public class Question7 {
    int num, n, sum;
    Scanner sc = new Scanner(System.in);

    void getSumOfDigit() {

        System.out.println("Enter a number");
        n = sc.nextInt();
        num = n;
        while (n != 0) {
            int rem = n % 10;
            int co = n / 10;
            sum += rem;
            n = co;
        }
        System.out.println("sum of " + num + " is " + sum);
    }
}

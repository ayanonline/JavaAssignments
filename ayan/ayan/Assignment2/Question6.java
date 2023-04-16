import java.util.Scanner;

public class Question6 {
    int n;
    Scanner sc = new Scanner(System.in);

    void getTable() {
        System.out.println("Enter a number to get table");
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + n + " = " + i * n);
        }
    }
}

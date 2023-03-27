import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("do you have diabetes? \n true or false?");
            boolean isDiabetes = sc.nextBoolean();
            if (!isDiabetes) {
                System.out.println("Congratulation you can donate");
            } else {
                System.out.println("You can't donate");
            }
        } else {
            System.out.println("You can't donate");
        }
    }
}

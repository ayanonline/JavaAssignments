import java.util.Scanner;

/**
 * Question7
 */
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check");
        char var = sc.next().charAt(0);

        if (var == 'a' || var == 'e' || var == 'i' || var == 'o' || var == 'u') {
            System.out.println(var + " is a vowel");
        } else {
            System.out.println(var + " is consonent");
        }
    }
}
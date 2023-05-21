import java.util.Scanner;

public class S8q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        char array[] = word.toCharArray();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}

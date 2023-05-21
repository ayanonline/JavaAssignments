
/**
 * S8q1
 */
import java.util.Scanner;

public class S8q1 {
    int top, arr[];

    S8q1() {
        arr = new int[10];
        top = -1;
    }

    void add(int item) {
        if (top < 9) {
            arr[++top] = item;
            System.out.println(item + " added to the stack");
        } else {
            System.out.println("Array is full");
        }
    }

    void out() {
        if (top >= 0) {
            int num = arr[top--];
            System.out.println(num + " is removed from the array");
        } else {
            System.out.println("Array is empty");
        }
    }

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        S8q1 obj = new S8q1();
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add an integer to the stack");
            System.out.println("2. Remove an integer from the stack");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number to add: ");
                    int numToAdd = scanner.nextInt();
                    obj.add(numToAdd);
                    break;
                case 2:
                    obj.out();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("please choose correct number");
                    break;
            }
        } while (choice != 3);
    }
}
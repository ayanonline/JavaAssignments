package s4;

import java.util.Scanner;

public class Calculator {
    public Calculator() {
        System.out.println("this is calculator constructor");
    }

    public Calculator(int a, int b) {
        System.out.println(" this is parameterize construcrtor");
    }

    int opp1, opp2;

    public void setValue(int a, int b) {
        opp1 = a;
        opp2 = b;
    }

    public int add() {
        return opp1 + opp2;
    }

    public int subtract() {
        return opp1 - opp2;
    }

    public int multiply() {
        return opp1 * opp2;
    }

    public int divide() {
        return opp1 / opp2;
    }
}

// class Main {
// public static void main(String[] args) {
// int choice;
// Calculator cal = new Calculator(5, 10);
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the first number: ");
// cal.opp1 = sc.nextInt();
// System.out.print("\nEnter the second number: ");
// cal.opp2 = sc.nextInt();
// System.out.print(
// "Enter your choice: \n1 for addition \n2 for substration \n3 for
// multiplication \n4 for division\n");
// choice = sc.nextInt();
// while (choice != 5) {
// switch (choice) {
// case 1:
// System.out.println("Addition of " + cal.opp1 + " and " + cal.opp2 + " = " +
// cal.add());
// break;
// case 2:
// System.out.println("Subtraction of " + cal.opp1 + " and " + cal.opp2 + " = "
// + cal.subtract());
// break;
// case 3:
// System.out.println("Multiplication of " + cal.opp1 + " and " + cal.opp2 + " =
// " + cal.multiply());
// break;
// case 4:
// System.out.println("Division of " + cal.opp1 + " and " + cal.opp2 + " = " +
// cal.divide());
// break;
// default:
// System.out.println("Please enter correct choice");
// break;
// }
// }

// }
// }

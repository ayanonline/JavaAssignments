import java.util.Scanner;

public class Question4 {
    float l, b, area, perimeter;
    Scanner sc = new Scanner(System.in);

    void clacArea() {
        System.out.println("Enter the value of l ");
        l = sc.nextFloat();
        System.out.println("Enter the value of B ");
        b = sc.nextFloat();
        area = l * b;
        System.out.println("Area of rectangle is " + area);
    }

    void clacPeri() {
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
}

// l*b;
// 2(l+b)

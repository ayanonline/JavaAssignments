/**
 * InnerQuestion2
 */
class CalcArea {
    float pi = 3.14f;
    double area;

    void calculateArea(float r) {
        area = pi * r * r;
        System.out.println("Area of the circle is " + area);
    }

    void calculateArea(float l, float b) {
        area = l * b;
        System.out.println("Area of rectangle is " + area);
    }
}

public class Question2 {
    public static void main(String[] args) {
        CalcArea obj = new CalcArea();
        obj.calculateArea(4.5f);
        obj.calculateArea(4, 5);
    }
}

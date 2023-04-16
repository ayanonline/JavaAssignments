class Rectangle {
    float area;

    Rectangle(float l, float b) {
        area = l * b;
    }

    Rectangle(float a) {
        area = a * a;
    }
}

public class S4Question2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5.5f);
        Rectangle square = new Rectangle(5.2f);
        System.out.println("Area of rectangle is " + rectangle.area);
        System.out.println("Area of square is" + square.area);
    }
}

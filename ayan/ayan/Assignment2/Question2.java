class Question2 {
    double r, area, perimeter, pi = 3.14f;

    void clacArea() {
        area = pi * r * r;
        System.out.println("Area of the circle is " + area);
    }

    void clacPeri() {
        perimeter = 2 * pi * r;
        System.out.println("Perimeter of the circle is " + perimeter);
    }
}

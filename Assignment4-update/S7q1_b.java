package p2;

import s4.Calculator;

public class S7q1_b extends Calculator {
    int num1, num2;

    public void setValue(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int divide() {
        return num1 / num2;
    }

    public static void main(String[] args) {
        System.out.println("this is output");
        // Calculator cal = new Calculator(6, 3);
        S7q1_b obj = new S7q1_b();
        obj.setValue(6, 3);
        System.out.println(obj.divide());
    }
}

package p2;

import s4.Calculator;

public class S7q1_b extends Calculator {
    int num1, num2;

    public void setValue(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("devisor can't be zero");
            return 0;
        }
    }

    public static void main(String[] args) {
        // Calculator cal = new Calculator(6, 3);
        S7q1_b obj = new S7q1_b();
        try {
            obj.setValue(6, 0);
            System.out.println(obj.divide());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

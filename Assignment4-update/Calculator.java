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

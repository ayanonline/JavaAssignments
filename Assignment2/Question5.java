class Large {
    int num1, num2;

    void largerValue() {
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}

public class Question5 {
    public static void main(String[] args) {
        Large obj = new Large();
        obj.num1 = Integer.parseInt(args[0]);
        obj.num2 = Integer.parseInt(args[1]);
        obj.largerValue();
    }
}

// comand line argument
// java class name then arguments
// javac Question5.java
// java Question5 11 22
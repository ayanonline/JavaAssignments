/**
 * Question3
 */
class PrintNumber {
    void printData(int n) {
        System.out.println(n);
    }

    void printData(float n) {
        System.out.println(n);
    }

    void printData(char n) {
        System.out.println(n);
    }

    void printData(String n) {
        System.out.println(n);
    }
}

public class Question3 {
    public static void main(String[] args) {
        PrintNumber obj = new PrintNumber();
        obj.printData(10);
        obj.printData(10.5f);
        obj.printData('A');
        obj.printData("Ayan");
    }
}

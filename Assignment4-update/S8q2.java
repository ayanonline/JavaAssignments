public class S8q2 {
    String computerPeripherals[] = { "Monitor", "CPU", "MOUSE", "KEYBOARD", "MODEM", "PRINTER" };
    int second[] = { 60, 30, 90, 80, 40, 50 };

    void display() {
        for (int i = 0; i < computerPeripherals.length; i++) {
            System.out.println(second[i] + " " + computerPeripherals[i]);
        }
    }

    public static void main(String[] args) {
        S8q2 obj = new S8q2();
        obj.display();
    }
}

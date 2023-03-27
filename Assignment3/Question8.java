class Test {
    int roll;
    String name;
    static String cn = "Brainware University";

    Test(int a, String b) {
        roll = a;
        name = b;
    }

    void display() {
        System.out.println(roll + name + cn);
    }

    // we can change static varible data using static method
    static void changeCn(String newCn) {
        cn = newCn;
    }

}

public class Question8 {
    public static void main(String[] args) {
        Test s1 = new Test(109, " Sayani ");
        s1.display();

        // we call static method using class name
        Test.changeCn("Apna College");

        Test s2 = new Test(66, " Ayan ");
        s2.display();
    }
}

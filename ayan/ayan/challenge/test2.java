package p2;

class test1 {
    int fact = 1;

    void calFact() {
        p1.test obj = new p1.test();
        obj.takeInput();
        for (int i = 1; i <= obj.a; i++) {
            fact *= i;
        }
    }
}

class test2 {
    public static void main(String[] args) {
        test1 t1 = new test1();
        t1.calFact();
        System.out.println(t1.fact);
    }
}

package p2;

class nonsub1 {
    p1.Protection obj = new p1.Protection();

    nonsub1() {
        // System.out.println(obj.n);
        // System.out.println(obj.n_pri);
        // System.out.println(obj.n_pro);
        System.out.println(obj.n_pub);

    }
}

class nonsub {
    public static void main(String[] args) {
        nonsub1 obj = new nonsub1();
    }
}
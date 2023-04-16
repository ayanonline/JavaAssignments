/**
 * Question1
 */
class InnerQuestion {
    int div(int a, int b) {
        return a / b;
    }

    float div(float a, float b) {
        return a / b;
    }

}

class S4Question1 {
    public static void main(String[] args) {
        InnerQuestion obj = new InnerQuestion();
        System.out.println(obj.div(10, 2));
        System.out.println(obj.div(12.50f, 6.50f));
    }
}

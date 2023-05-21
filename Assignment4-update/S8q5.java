public class S8q5 {
    int first[][] = { { 1, 0, 1 }, { 4, 5, 6 }, { 1, 2, 3 } };
    int second[][] = { { 1, 1, 1 }, { 2, 3, 1 }, { 1, 5, 1 } };
    int sum[][];

    // for memory allocation of sum array
    S8q5() {
        sum = new int[3][3];
    }

    // sum of two 2d array
    void addition(int first[][], int second[][]) {
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first.length; j++) {=
                sum[i][j] = first[i][j] + second[i][j];
            }
        }
    }

    void display() {
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        S8q5 obj = new S8q5();
        obj.addition(obj.first, obj.second);
        obj.display();
    }
}

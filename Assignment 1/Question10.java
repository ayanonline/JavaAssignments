public class Question10 {
    public static void main(String[] args) {
        // declare
        int myArray[] = new int[5];

        // initialize
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 44;
        myArray[4] = 55;

        // cloning myArray using clone method/function
        int cloneArray[] = myArray.clone();

        // displaying the cloneArray
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.println(cloneArray[i]);
        }
    }
}

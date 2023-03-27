public class Question9 {
    public static void main(String[] args) {
        // declare
        int myArray[] = new int[5];
        int copyArray[] = new int[5];

        // initialize
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 44;
        myArray[4] = 55;

        // coping myArray elements into copyArray using for loop
        for (int i = 0; i < myArray.length; i++) {
            copyArray[i] = myArray[i];
        }

        // displaying the copyArray
        for (int i = 0; i < copyArray.length; i++) {
            System.out.println(copyArray[i]);
        }
    }
}

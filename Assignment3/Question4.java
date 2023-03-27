/**
 * Question4
 */
class Student {
    String name;

    Student() {
        name = "Unknown";
        System.out.println(name);
    }

    Student(String studentName) {
        name = studentName;
        System.out.println(name);
    }

}

public class Question4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Ayan Ghosh");
    }
}

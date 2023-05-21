class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this.name = "null";
        this.age = 0;
    }

    // Copy constructor
    Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Temp3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Priyanka");
        p1.setAge(22);
        Person p2 = new Person(p1);

        System.out.println(p1.getName() + " " + p1.getAge());
        System.out.println(p2.getName() + " " + p2.getAge());
    }
}

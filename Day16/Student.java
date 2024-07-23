class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

}

public class Student extends Person {
    int id;

    Student(String name, int id) {
        super(name);
        this.id = id;
    }

    public static void main(String[] args) {
        Student s = new Student("Nebu", 10);
        System.out.println(s.name);
        System.out.println(s.id);
    }

}

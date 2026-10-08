package Week_8;

final class Student {

    private final int id;
    private final String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Task4 {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Pavithra");

        System.out.println("Student ID: " + s1.getId());
        System.out.println("Student Name: " + s1.getName());

        // Values cannot be changed after object creation
    }
}
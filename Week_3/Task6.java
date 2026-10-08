package Week_3;

import java.util.*;

class Student6 {

    int id;
    String name;
    double cgpa;

    Student6(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

class Checker implements Comparator<Student6> {

    public int compare(Student6 a, Student6 b) {

        // Higher CGPA first
        int result = Double.compare(b.cgpa, a.cgpa);

        if (result != 0)
            return result;

        // Alphabetical name
        result = a.name.compareTo(b.name);

        if (result != 0)
            return result;

        // Lower ID first
        return Integer.compare(a.id, b.id);
    }
}

public class Task6 {

    public static void main(String[] args) {

        // Sorting priority:
        // 1. Higher CGPA
        // 2. Alphabetical name
        // 3. Lower ID
    }
}
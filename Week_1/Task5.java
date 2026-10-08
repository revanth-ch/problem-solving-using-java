package Week_1;

import java.util.*;

class Student {

    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

class Checker5 implements Comparator<Student> {

    public int compare(Student a, Student b) {

        if (a.cgpa != b.cgpa) {
            return Double.compare(b.cgpa, a.cgpa);
        }

        int nameCompare = a.name.compareTo(b.name);

        if (nameCompare != 0) {
            return nameCompare;
        }

        return Integer.compare(a.id, b.id);
    }
}

public class Task5 {

    public static void main(String[] args) {

        // Sorting priority:
        // 1. Higher CGPA
        // 2. Name in alphabetical order
        // 3. Lower ID
    }
}
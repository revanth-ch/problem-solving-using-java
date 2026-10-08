package Week_7;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class Task2 {

    public static void main(String[] args) {

        Student student = new Student();
        Rockstar rockstar = new Rockstar();
        Hacker hacker = new Hacker();

        Object[] objects = {
            student,
            rockstar,
            hacker
        };

        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;

        for (Object obj : objects) {

            if (obj instanceof Student) {
                studentCount++;
            }

            if (obj instanceof Rockstar) {
                rockstarCount++;
            }

            if (obj instanceof Hacker) {
                hackerCount++;
            }
        }

        System.out.println(
            studentCount + " " +
            rockstarCount + " " +
            hackerCount
        );
    }
}
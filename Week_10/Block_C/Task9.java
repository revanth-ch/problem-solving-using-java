package Week_10.Block_C;

import java.util.*;

class Student {

    String name;
    int marks;

    Student(String name, int marks) {

        this.name = name;
        this.marks = marks;
    }
}

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<Integer, Student> index =
                new HashMap<>();

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            int marks = sc.nextInt();

            index.put(
                    id,
                    new Student(name, marks)
            );
        }

        int q = sc.nextInt();

        while (q-- > 0) {

            int id = sc.nextInt();

            Student s = index.get(id);

            if (s != null) {

                System.out.println(
                        s.name + " " + s.marks
                );

            } else {

                System.out.println("NOT FOUND");
            }
        }

        sc.close();
    }
}
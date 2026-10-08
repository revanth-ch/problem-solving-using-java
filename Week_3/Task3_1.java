package Week_3;

import java.util.*;

class Student {

    String name;
    double cgpa;
    int id;

    Student(String name, double cgpa, int id) {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> pq = new PriorityQueue<>(
                (a, b) -> {

                    int cmp = Double.compare(b.cgpa, a.cgpa);

                    if (cmp != 0)
                        return cmp;

                    cmp = a.name.compareTo(b.name);

                    if (cmp != 0)
                        return cmp;

                    return Integer.compare(a.id, b.id);
                }
        );

        for (String event : events) {

            String[] parts = event.split(" ");

            if (parts[0].equals("ENTER")) {

                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);

                pq.add(new Student(name, cgpa, id));

            } else if (parts[0].equals("SERVED")) {

                if (!pq.isEmpty()) {
                    pq.poll();
                }
            }
        }

        List<Student> result = new ArrayList<>();

        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        return result;
    }
}

public class Task3_1 {

    public static void main(String[] args) {
        // Priority order:
        // 1. Highest CGPA
        // 2. Alphabetically smaller name
        // 3. Smaller ID
    }
}
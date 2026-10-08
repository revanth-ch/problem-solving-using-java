package Week_10.Block_A;

import java.util.ArrayList;
import java.util.Collections;

public class Task4 {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(78);
        marks.add(85);
        marks.add(92);
        marks.add(67);
        marks.add(88);

        System.out.println("Student Marks: " + marks);

        int highest = Collections.max(marks);

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        double average = (double) total / marks.size();

        System.out.println("Highest Mark: " + highest);
        System.out.println("Average Mark: " + average);
    }
}
package Week_10.Block_A;

import java.util.HashMap;

public class Task9 {

    public static void main(String[] args) {

        HashMap<Integer, Integer> marks = new HashMap<>();

        marks.put(101, 85);
        marks.put(102, 92);
        marks.put(103, 78);
        marks.put(104, 95);

        int rollNo = 102;

        System.out.println(
                "Student marks: " + marks.get(rollNo)
        );
    }
}
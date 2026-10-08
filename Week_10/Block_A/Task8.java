package Week_10.Block_A;

import java.util.HashSet;

public class Task8 {

    public static void main(String[] args) {

        HashSet<String> student1 = new HashSet<>();
        HashSet<String> student2 = new HashSet<>();

        student1.add("Maths");
        student1.add("Physics");
        student1.add("Chemistry");
        student1.add("Biology");

        student2.add("Chemistry");
        student2.add("Biology");
        student2.add("Computer Science");

        student1.retainAll(student2);

        System.out.println(
                "Common subjects: " + student1
        );
    }
}
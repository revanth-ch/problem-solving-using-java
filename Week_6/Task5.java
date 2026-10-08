package Week_6;

public class Task5 {

    public static int marsExploration(String s) {

        String pattern = "SOS";

        int changes = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) !=
                    pattern.charAt(i % 3)) {

                changes++;
            }
        }

        return changes;
    }
}
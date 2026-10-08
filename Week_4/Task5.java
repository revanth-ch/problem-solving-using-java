package Week_4;

import java.util.*;

public class Task5 {

    public static String timeConversion(String s) {

        String ampm = s.substring(8, 10);

        int hour = Integer.parseInt(s.substring(0, 2));

        if (ampm.equals("AM")) {

            if (hour == 12) {
                hour = 0;
            }

        } else {

            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d", hour)
                + s.substring(2, 8);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(timeConversion(s));
    }
}
package Week_3;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Task1_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        String dayName = date.getDayOfWeek()
                .getDisplayName(
                        TextStyle.FULL,
                        Locale.ENGLISH
                );

        System.out.println(dayName.toUpperCase());
    }
}
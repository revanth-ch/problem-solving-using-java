package Week_3;

import java.util.*;

public class Task7_1 {

    public static void main(String[] args) {

        Integer[] arr = {5, 2, 8, 1, 9, 3};

        Arrays.sort(arr, (a, b) -> b - a);

        System.out.println(Arrays.toString(arr));
    }
}
package Week_5;

import java.util.*;

public class Task3 {

    public static List<Integer> maxSubarray(
            List<Integer> arr) {

        int current = arr.get(0);
        int maxSub = arr.get(0);

        int maxElement = arr.get(0);
        int maxNonContiguous = 0;

        boolean hasPositive = arr.get(0) > 0;

        for (int i = 1; i < arr.size(); i++) {

            int value = arr.get(i);

            current = Math.max(
                    value,
                    current + value
            );

            maxSub = Math.max(maxSub, current);

            maxElement = Math.max(maxElement, value);

            if (value > 0) {
                maxNonContiguous += value;
                hasPositive = true;
            }
        }

        if (!hasPositive) {
            maxNonContiguous = maxElement;
        }

        return Arrays.asList(
                maxSub,
                maxNonContiguous
        );
    }
}
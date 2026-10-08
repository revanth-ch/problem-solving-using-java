package Week_10.Block_C;

import java.util.*;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        Map<Integer, Integer> valueFreq =
                new HashMap<>();

        Map<Integer, Integer> freqCount =
                new HashMap<>();

        while (q-- > 0) {

            int type = sc.nextInt();
            int x = sc.nextInt();

            if (type == 1) {

                int oldFreq =
                        valueFreq.getOrDefault(x, 0);

                int newFreq = oldFreq + 1;

                valueFreq.put(x, newFreq);

                if (oldFreq > 0) {

                    freqCount.put(
                            oldFreq,
                            freqCount.get(oldFreq) - 1
                    );
                }

                freqCount.put(
                        newFreq,
                        freqCount.getOrDefault(
                                newFreq, 0
                        ) + 1
                );
            }

            else if (type == 2) {

                int oldFreq =
                        valueFreq.getOrDefault(x, 0);

                if (oldFreq > 0) {

                    int newFreq = oldFreq - 1;

                    valueFreq.put(x, newFreq);

                    freqCount.put(
                            oldFreq,
                            freqCount.get(oldFreq) - 1
                    );

                    if (newFreq > 0) {

                        freqCount.put(
                                newFreq,
                                freqCount.getOrDefault(
                                        newFreq, 0
                                ) + 1
                        );
                    }
                }
            }

            else if (type == 3) {

                System.out.println(
                        freqCount.getOrDefault(x, 0) > 0
                                ? 1
                                : 0
                );
            }
        }

        sc.close();
    }
}
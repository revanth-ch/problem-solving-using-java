package Week_2;

public class Task3_2 {

    public int largestAltitude(int[] gain) {

        int altitude = 0;
        int highest = 0;

        for (int g : gain) {

            altitude += g;

            highest = Math.max(highest, altitude);
        }

        return highest;
    }
}
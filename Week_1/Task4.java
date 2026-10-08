package Week_1;

import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker {

    public Comparator<Player> descComparator = new Comparator<Player>() {

        public int compare(Player a, Player b) {

            if (a.score != b.score) {
                return b.score - a.score;
            }

            return a.name.compareTo(b.name);
        }
    };
}

public class Task4 {

    public static void main(String[] args) {

        Checker checker = new Checker();

        // Comparator logic:
        // Higher score comes first.
        // If scores are equal, alphabetical order is used.
    }
}
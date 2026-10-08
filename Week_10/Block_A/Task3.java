package Week_10.Block_A;

import java.util.Stack;

public class Task3 {

    public static void main(String[] args) {

        Stack<String> history = new Stack<>();

        history.push("Google");
        history.push("YouTube");
        history.push("Wikipedia");
        history.push("GitHub");

        System.out.println("Browser History: " + history);

        String backPage = history.pop();

        System.out.println("Going Back From: " + backPage);
        System.out.println("Current History: " + history);
    }
}
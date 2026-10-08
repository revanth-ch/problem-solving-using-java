package Week_10.Block_A;

import java.util.LinkedHashSet;

public class Task6 {

    public static void main(String[] args) {

        LinkedHashSet<String> cart = new LinkedHashSet<>();

        cart.add("Book");
        cart.add("Pen");
        cart.add("Notebook");
        cart.add("Pen");
        cart.add("Book");
        cart.add("Pencil");

        System.out.println(
                "Unique items purchased: " + cart
        );
    }
}
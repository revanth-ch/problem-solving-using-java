package Week_10.Block_A;

import java.util.*;

class Order {
    int id;
    int priority;

    Order(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Task1 {

    public static void main(String[] args) {

        Map<Integer, String> products = new HashMap<>();

        products.put(101, "Laptop");
        products.put(102, "Mobile");
        products.put(103, "Headphones");

        List<String> history = new ArrayList<>();

        // Priority-based collection
        PriorityQueue<Order> orders =
                new PriorityQueue<>((a, b) ->
                        Integer.compare(b.priority, a.priority));

        orders.add(new Order(1, 2));
        orders.add(new Order(2, 5));
        orders.add(new Order(3, 1));

        history.add("Order 1");
        history.add("Order 2");

        System.out.println("Product: " + products.get(102));

        System.out.println("Processing orders:");

        while (!orders.isEmpty()) {
            Order order = orders.poll();

            System.out.println(
                    "Order " + order.id +
                    " Priority: " + order.priority
            );
        }

        System.out.println("Order History: " + history);
    }
}
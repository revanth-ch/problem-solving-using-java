package Week_10.Block_C;

import java.util.*;

class Product {

    int id;
    String name;
    int stock;
    int price;

    Product(
            int id,
            String name,
            int stock,
            int price) {

        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
}

public class Task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<Integer, Product> products =
                new HashMap<>();

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            int stock = sc.nextInt();
            int price = sc.nextInt();

            products.put(
                    id,
                    new Product(
                            id,
                            name,
                            stock,
                            price
                    )
            );
        }

        int sales = sc.nextInt();

        for (int i = 0; i < sales; i++) {

            int id = sc.nextInt();
            int quantity = sc.nextInt();

            Product p = products.get(id);

            if (p != null && p.stock >= quantity) {

                p.stock -= quantity;
            }
        }

        int threshold = sc.nextInt();

        List<Product> lowStock =
                new ArrayList<>();

        for (Product p : products.values()) {

            if (p.stock <= threshold) {

                lowStock.add(p);
            }
        }

        lowStock.sort(
                Comparator.comparingInt(
                        p -> p.stock
                )
        );

        for (Product p : lowStock) {

            System.out.println(
                    p.id + " "
                    + p.name + " "
                    + p.stock
            );
        }

        sc.close();
    }
}
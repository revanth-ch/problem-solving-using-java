package Week_10.Block_A;

import java.util.HashMap;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> contacts = new HashMap<>();

        System.out.print("Enter number of contacts: ");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String name = sc.next();
            String phone = sc.next();

            contacts.put(name, phone);
        }

        System.out.print("Enter contact name to search: ");

        String name = sc.next();

        if (contacts.containsKey(name)) {

            System.out.println(
                    name + "'s phone number: "
                    + contacts.get(name)
            );

            System.out.print("Enter new phone number: ");

            String newPhone = sc.next();

            contacts.put(name, newPhone);

            System.out.println(
                    "Updated phone number: "
                    + contacts.get(name)
            );

        } else {

            System.out.println("Contact not found.");
        }

        sc.close();
    }
}
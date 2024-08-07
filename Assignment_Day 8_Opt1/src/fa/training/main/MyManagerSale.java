package fa.training.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fa.training.entities.Sale;

public class MyManagerSale {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            System.out.print("*");
        }
        Scanner scanner = new Scanner(System.in);
        List<Sale> sales = new ArrayList<>();
        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add new Sale");
            System.out.println("2. Print all Sale");
            System.out.println("3. Print bonus of all Sales");
            System.out.println("4. Exit");
            System.out.print("\nEnter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Sale sale = new Sale();
                    sale.inputInfo();
                    sales.add(sale);
                    break;
                case 2:
                    for (Sale s1 : sales) {
                        s1.printInfo();
                        System.out.println();
                    }
                    break;
                case 3:
                    for (Sale s2 : sales) {
                        System.out.println("Name: " + s2.getName());
                        System.out.println("Bonus: " + s2.getBonus());
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
}

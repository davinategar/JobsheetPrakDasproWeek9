import java.util.Scanner;

public class Assignment2 {

    static int searchMenu(String[] menu, String name) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    static void showMenu(String[] menu, int[] prices) {
        System.out.println("\n----- MENU LIST -----");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + prices[i]);
        }
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Fried Rice", "Fried Noodles", "Toast", "French Fries", "Pulled Tea", "Cappuccino", "Chocolate Ice"};
        int[] prices = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        String[] orders = new String[100];
        int orderCount = 0;
        int total = 0;

        int choice;
        do {
            System.out.println("\n=== CAMPUS CAFE ===");
            System.out.println("1. Search menu");
            System.out.println("2. Place order");
            System.out.println("3. Finish and show orders");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                showMenu(menu, prices);
                System.out.print("Enter menu name to search: ");
                String name = sc.nextLine();
                int index = searchMenu(menu, name);
                if (index != -1) {
                    System.out.println(menu[index] + " costs Rp" + prices[index]);
                } else {
                    System.out.println("Menu item is not available.");
                }

            } else if (choice == 2) {
                System.out.print("Number of items to order: ");
                int quantity = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < quantity; i++) {
                    int index;
                    do {
                        System.out.print("Menu name #" + (i + 1) + ": ");
                        String name = sc.nextLine();
                        index = searchMenu(menu, name);
                        if (index == -1) {
                            System.out.println("Menu item not found, please try again.");
                        }
                    } while (index == -1);

                    orders[orderCount] = menu[index];
                    orderCount++;
                    total += prices[index];
                }
            }
        } while (choice != 3);

        System.out.println("\n===== ORDER LIST =====");
        for (int i = 0; i < orderCount; i++) {
            System.out.println((i + 1) + ". " + orders[i]);
        }
        System.out.println("----------------------");
        System.out.println("Total cost: Rp" + total);
    }
}
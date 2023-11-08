import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TeaHouseCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Mavar Tea House Reservation System!");
        System.out.println("Please select the table type (standard/vip):");

        String tableType = scanner.nextLine();
        TableFactory tableFactory = new TableFactory();
        Table table = tableFactory.createTable(tableType);

        if (table != null) {
            System.out.println("Table reserved!");

            // Create a menu
            Menu menu = new Menu();
            menu.displayMenu();

            System.out.println("Enter the numbers of items to order (comma-separated):");
            String orderInput = scanner.nextLine();
            String[] orderItems = orderInput.split(",");

            Map<Integer, Integer> orders = new HashMap<>();
            for (String orderItem : orderItems) {
                int itemNumber = Integer.parseInt(orderItem.trim());
                MenuItem menuItem = menu.getItem(itemNumber);
                if (menuItem != null) {
                    int quantity = orders.getOrDefault(itemNumber, 0) + 1;
                    orders.put(itemNumber, quantity);
                }
            }

            // Calculate the total amount
            double totalAmount = 0;
            for (Map.Entry<Integer, Integer> order : orders.entrySet()) {
                int itemNumber = order.getKey();
                int quantity = order.getValue();
                MenuItem menuItem = menu.getItem(itemNumber);
                if (menuItem != null) {
                    totalAmount += menuItem.getPrice() * quantity;
                }
            }

            System.out.println("Total amount: $" + totalAmount);

            // Select payment method
            System.out.println("Select payment method (online/cash):");
            String paymentMethod = scanner.nextLine();

            PaymentAdapter paymentAdapter;
            if (paymentMethod.equalsIgnoreCase("online")) {
                paymentAdapter = new OnlinePaymentAdapter();
            } else {
                paymentAdapter = null;
            }

            if (paymentAdapter != null) {
                paymentAdapter.pay(totalAmount);
                System.out.println("Payment successful!");
            } else {
                System.out.println("Cash payment is not supported.");
            }

            System.out.println("Thank you for your order!");
        } else {
            System.out.println("Sorry, tables of the selected type are not available.");
        }
    }
}
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Menu {
    private Map<Integer, MenuItem> menuItems;

    public Menu() {
        menuItems = new HashMap<>();
        menuItems.put(1, new MenuItem("Green jasmine tea", 3.5));
        menuItems.put(2, new MenuItem("Pu'er tea", 4.5));
        menuItems.put(3, new MenuItem("Berry tea", 3.5));
        menuItems.put(4, new MenuItem("Lagman", 5.0));
        menuItems.put(5, new MenuItem("Doner Kebab", 4.5));
        menuItems.put(6, new MenuItem("Shashlik", 6.0));
        menuItems.put(7, new MenuItem("Plov", 4.5));
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (int number : menuItems.keySet()) {
            MenuItem item = menuItems.get(number);
            System.out.println(number + ". " + item.getName() + " - $" + item.getPrice());
        }
    }

    public MenuItem getItem(int number) {
        return menuItems.get(number);
    }
}

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
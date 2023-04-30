import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scan;
    private ArrayList<Product> products;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.products = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.println("Hi there!");
            System.out.println("Welcome here where the food is the best in the world");
            System.out.println("What can we offer you?(Drinks or Food)");
            String whatCosumatorWant = scan.nextLine();
            if (whatCosumatorWant.equalsIgnoreCase("food")) {

            }

        }
    }
}

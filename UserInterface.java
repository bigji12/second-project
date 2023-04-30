import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scan;
    private ArrayList<Product> products;
    private Product product;

    public UserInterface(Scanner scan, Product product) {
        this.scan = scan;
        this.products = new ArrayList<>();
        this.product = product;
    }

    public void start() {
        System.out.println("Hi there!");
        System.out.println("Welcome here where the food is the best in the world");
        while (true) {
            personalData();
            System.out.println("What can we offer you?(Drinks or Food)");
            String whatCosumatorWant = scan.nextLine();
            if (whatCosumatorWant.toLowerCase().equals("food")) {
                foodMethod();
            }

        }
    }
    public void foodMethod() {
        this.product.iteratorInFile("Menu");
        this.product.printMenu();
        System.out.println("Everything is very delicious.");
        System.out.println("What do you like to eat?");
        String food = scan.nextLine();
        if (product.contains(food)) {
            System.out.println("Do you want something else?(yes/no)");
            String somethingElse = scan.nextLine();
            if (somethingElse.toLowerCase().equals("yes")) {
                this.product.printMenu();
                String secondFood = scan.nextLine();
                if (product.contains(secondFood)) {
                    System.out.println("Your total bill it's: " + this.product.totalPrice());
                }
            } else {
                System.out.println("Bill you have to pay for your food: " + this.product.priceOfFood(food));
            }
        }
    }

    public void personalData() {
        System.out.println("Your name:");
        String name = scan.nextLine();
        System.out.println("Your address:");
        String address = scan.nextLine();
        System.out.println("Your phone number:");
        int phoneNumber = Integer.valueOf(scan.nextLine());
    }
}

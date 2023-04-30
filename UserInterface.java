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
        while (true) {
            System.out.println("Hi there!");
            System.out.println("Welcome here where the food is the best in the world");
            Registration(scan);
            System.out.println("What can we offer you?(Drinks or Food)");
            String whatCosumatorWant = scan.nextLine();
            if (whatCosumatorWant.equals("food")) {
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
        if(products.contains(food)){
            System.out.println("Bill you have to pay for your food: " + this.product.priceOfFood(food));
            System.out.println("Do you want something else?");
            String somethingElse = scan.nextLine();
            if(somethingElse.equals("i won somthing else to eat")){
                this.product.printMenu();
                String secondFood = scan.nextLine();
                if(products.contains(secondFood)){
                    System.out.println("Your total bill it's: " + this.product.totalPrice());
                }
            }

        }
    }
}

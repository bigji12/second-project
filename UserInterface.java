import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private FoodOrder product;

    public UserInterface(Scanner scan, FoodOrder product) {
        this.scan = scan;
        this.product = product;
    }

    public void start() {
        System.out.println("Hi there!");
        System.out.println("Welcome here where the food is the best in the world");
        System.out.println("As a start you have to provide some personal data:");
        personalData();
        System.out.println("What can we offer you?(Drinks or Food)");
        String whatCosumatorWant = scan.nextLine();
        while (true) {
            if (whatCosumatorWant.toLowerCase().equals("food")) {
                foodMethod();
                break;
            }
        }
    }
    public void foodMethod() {
        this.product.iteratorInFile("FoodMenu");
        this.product.printMenu();
        System.out.println("Everything is very delicious.");
        System.out.println("Do you want to make an order?(yes/no)");
        String responseToOrder = scan.nextLine();
        if (responseToOrder.toLowerCase().equals("yes")) {
            System.out.println("Choose what you want");
            String choosing = scan.nextLine();
            if (product.contains(choosing)) {
                product.saveOrderAndPrice(choosing);
            } else {
                System.out.println("This food does not exist");
            }
            while (true) {
                System.out.println("Do you want something else?(yes/no)");
                String answer = scan.nextLine();
                if (answer.toLowerCase().equals("yes")) {
                    product.printMenu();
                    System.out.println("Choose what you want");
                    String choosing2 = scan.nextLine();
                    if (product.contains(choosing2)) {
                        product.saveOrderAndPrice(choosing2);
                    } else {
                        System.out.println("This food does not exist");
                    }

                } else {
                    break;
                }
            }
            product.printOrderList();
            System.out.println("Your total payment is: " + product.totalPrice() + "$");
            if (product.totalPrice() == 0.0) {
                System.out.println("See you next time!");

            } else {
                System.out.println("How do you want to make the payment? (cash/card)");
                String payment = scan.nextLine();

                if (payment.toLowerCase().equals("cash")) {
                    System.out.println("Thank you very much,enjoy the food");
                } else if (payment.toLowerCase().equals("card")) {
                    System.out.println("We need the ID of the card");
                    int idOfTheCard = Integer.valueOf(scan.nextLine());
                    System.out.println("Thank you very much,enjoy the food!");
                }
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
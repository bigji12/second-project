import java.util.Scanner;
import java.util.ArrayList;
public class UserInterface{
    private Scanner scan;
    private ArrayList <Product>  products;

    public UserInterface(Scanner scan){
        this.scan = scan;
        this.products = new ArrayList<>();
    }

    public void start(){
        while(true){
            System.out.println("Hi there!");
            System.out.println("Welcome here where the food is the best in the world");
            System.out.println("What can we offer you?(Drinks or Food)");
            String whatCosumatorWant = scan.nextLine();
            if(whatCosumatorWant.equals("food")){
                foodMethod();
            }

        }
    }
    
    public void foodMethod() {
        products.printMenu();
        System.out.println("Everything is very delicious.");
        System.out.println("What do you like to eat?");
        String food = scan.nextLine();
        if(products.contanes(food)){
            System.out.println("Bill you have to pay for your food: " + products.priceOfFood);
            System.out.println("Do you want something else?");
            String somethingElse = scan.nextLine();
            if(something.equals("i won somthing else to eat")){
                products.printMenu();
                String secondFood = scan.nextLine();
                if(products.contanes(secondFood)){
                    System.out.println("Your total bill it's: " products.totalPrice);
                }
            }

        }
    }
}

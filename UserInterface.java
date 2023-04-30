import java.util.Scanner;
import java.util.ArrayList;
public class UserInterface{
    private Scanner scan;
    private ArrayList <Product>  products;
    private Product product;
    public UserInterface(Scanner scan,Product product){
        this.scan = scan;
        this.products = new ArrayList<>();
        this.product = product;
    }

    public void start(){
        while(true){
            System.out.println("Hi there!");
            System.out.println("Welcome here where the food is the best in the world");
            System.out.println("What can we offer you?(Drinks or Food)");
            String whatCosumatorWant = scan.nextLine();
            if(whatCosumatorWant.equals("food")){
                this.product.iteratorInFile("Menu");
                this.product.printMenu();
            }

        }
    }
}

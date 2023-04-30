import java.util.Scanner;
import java.util.ArrayList;

<<<<<<< HEAD
public class Product{
    private String foodName;
    private double foodPrice;

    public Product(String foodName, double foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
=======
public class Product {
    private String name;
    private double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
>>>>>>> 062eee3def4fb8838d135e7fe735acf8e5ffd813
    }

    public String getName() {
        return this.foodName; //Merr emrin e produktit(ushqimit)
    }

    public double getPrice() {
        return this.foodPrice; //Merr qmimin e produktit(ushqimit)
    }

    // Metoda për të marrë informacionin e produkteve nga file-i
<<<<<<< HEAD
    public static Product[] readProductsFromFile(String fileName) {
        try ( Scanner scan = new Scanner(Paths.get())) {
=======
    public static iteratorInFile (String fileName) {
        try (Scanner scan = new Scanner(Paths.get(fileName))) {
>>>>>>> 062eee3def4fb8838d135e7fe735acf8e5ffd813
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(",");
                String foodName = parts[0];
                double foodPrice = Double.parseDouble(parts[1]);
                
                
            }

        } catch (Exception e) {

        }
    }
}
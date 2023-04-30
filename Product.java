import java.util.Scanner;
import java.util.ArrayList;

<<<<<<< HEAD
public class Product {
    private ArrayList<String> food;
    //private ArrayList<Integer> price;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
=======

public class Product{
    private String foodName;
    private double foodPrice;

    public Product(String foodName, double foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;

>>>>>>> 090824aca8a7a11b6b38e2468995057838e11fa3

    public String getName() {
        return this.foodName; //Merr emrin e produktit(ushqimit)
    }

    public double getPrice() {
        return this.foodPrice; //Merr qmimin e produktit(ushqimit)
    }

    // Metoda për të marrë informacionin e produkteve nga file-i

    public static Product[] readProductsFromFile(String fileName) {
        try ( Scanner scan = new Scanner(Paths.get())) {

    public static iteratorInFile (String fileName) {
        try (Scanner scan = new Scanner(Paths.get(fileName))) {

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(",");
<<<<<<< HEAD
                String foodName = parts[0];
                double foodPrice = Double.parseDouble(parts[1]);
                
=======
                String name = parts[0];
                double price = Double.parseDouble(parts[1]);
                products[i] = new Product(name, price);
                i++;
>>>>>>> 090824aca8a7a11b6b38e2468995057838e11fa3
            }

        } catch (Exception e) {

        }
    }
}
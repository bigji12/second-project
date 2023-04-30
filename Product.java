import java.util.Scanner;
import java.util.ArrayList;


public class Product{
    private String foodName;
    private double foodPrice;

    public Product(String foodName, double foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;


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
                String name = parts[0];
                double price = Double.parseDouble(parts[1]);
                products[i] = new Product(name, price);
                i++;
            }

        } catch (Exception e) {

        }
    }
}
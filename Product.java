import java.util.Scanner;
import java.util.ArrayList;

public class Product {
    private String name;
    private double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Metoda për të marrë informacionin e produkteve nga file-i
    public static iteratorInFile (String fileName) {
        try (Scanner scan = new Scanner(Paths.get(fileName))) {
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
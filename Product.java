import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class Product {
    private ArrayList<String> foods;
    private ArrayList<Double> prices;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.foods = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    

    public void addPrice(Double foodPrice) {
        this.price += foodPrice;
    }

    public void printMenu() {
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(i + 1 + ". " + foods.get(i) + "=>" + prices.get(i) + "€");
        }
    }

    public void priceOfFood(String food) {
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).equals(food)) {
                Double priceOfThisFood = prices.get(i);
                addPrice(priceOfThisFood);
            }
        }
    }

    // Metoda për të marrë informacionin e produkteve nga file-i
    public void iteratorInFile(String fileName) {
        try (Scanner scan = new Scanner(Paths.get(fileName))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(",");
                String foodName = parts[0];
                double foodPrice = Double.parseDouble(parts[1]);
                foods.add(foodName);
                prices.add(foodPrice);
            }
        } catch (Exception e) {

        }
    }
}
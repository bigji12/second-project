import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class FoodOrder {
    private ArrayList<String> foods;
    private ArrayList<Double> prices;
    private ArrayList<String> order;
    private double price;

    public FoodOrder() {
        this.price = 0;
        this.foods = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.order = new ArrayList<>();
    }

    public double totalPrice() {
        return this.price;
    }

    public void addPrice(Double foodPrice) {
        this.price += foodPrice;
    }

    public void printMenu() {
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(i + 1 + ". " + foods.get(i) + " => " + prices.get(i) + "$");
        }
    }

    public void printOrderList() {
        if (order.size() == 0) {
            System.out.println("You have not placed any orders!!");
        } else {
            System.out.println("You ordered these:");
            for (String food : order) {
                System.out.println(food);
            }
        }

    }

    public void addFood(String customerOrder) {
        this.order.add(customerOrder);
    }

    public Double saveOrderAndPrice(String food) {
        Double priceOfThisFood = 0.0;
        String customerOrder = "";
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).equals(food)) {
                priceOfThisFood = prices.get(i);
                customerOrder = foods.get(i);
                addPrice(priceOfThisFood);
                addFood(customerOrder);
            }
        }
        return priceOfThisFood;
    }


}
public boolean contains(String food) {
        if (this.foods.contains(food)) {
            return true;
        }
        return false;
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
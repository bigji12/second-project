import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class FoodOrder {
    private ArrayList<String> foods;
    private ArrayList<Double> prices;
    private ArrayList<String> order;
    private int price;

    public FoodOrder() {
        this.foods = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.order = new ArrayList<>();
        this.price = price;
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

    public boolean contains(String food) {
        if (this.foods.contains(food)) {
            return true;
        }
        return false;
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

<<<<<<< Updated upstream

}
public boolean contains(String food) {
        if (this.foods.contains(food)) {
            return true;
        }
        return false;
    }

=======
>>>>>>> Stashed changes
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
            System.out.println(e.getMessage());
        }
<<<<<<< HEAD
    }
<<<<<<< Updated upstream

}
=======
    }
>>>>>>> 49d4854e665ea67eb0fa6195ad02db177ea31f7f
=======
}
>>>>>>> Stashed changes

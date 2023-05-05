import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodOrder products = new FoodOrder();
        UserInterface uI = new UserInterface(scanner,products);
        uI.start();

    }
}
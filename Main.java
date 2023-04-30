import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product dp = new Product();
        UserInterface ui = new UserInterface(scanner);
        ui.start();
    }

}

public class Main {
    public public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Product pd = new Product();

       UserInterface ui = new UserInterface(scanner);
       ui.start();  
    }

}
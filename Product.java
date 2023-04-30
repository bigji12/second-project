
public class Product{
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
    public static Product[] readProductsFromFile(String fileName) {
        try ( Scanner scan = new Scanner(Paths.get(fileName))) {
            while (scan.hasNextLine()) {
                String line = scanner.nextLine();
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
import java.util.Scanner;

public class registration {
    private Scanner scanner;
    private String name;
    public registration(Scanner scanner){
        this.scanner = scanner;
        this.name = "";
    }

    public void personalData(){
        System.out.println("Your name:");
        String name = scanner.nextLine();
        this.name = name;
        System.out.println("Your address:");
        String address = scanner.nextLine();
        System.out.println("Your phone number:");
        int phoneNumber = Integer.valueOf(scanner.nextLine());
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        String Name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.printf("Привет,"+Name+"!");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str_1 = scan.nextLine();
        String str_2 = scan.nextLine();

        if (str_1.endsWith(str_2)) {
            System.out.println("Вторая строка является окончанием первой.");
        } else {
            System.out.println("Вторая строка не является окончанием первой.");
        }
    }
}
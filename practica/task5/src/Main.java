import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            sum += num * num;
        }

        System.out.println(sum);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n_1 = scan.nextInt();
        int n_2 = scan.nextInt();
        int n_3 = scan.nextInt();

        for (int i = 1; i < n_3; i++) {
            int num = n_1 + i * n_2;
            System.out.print(num + " ");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n_1 = scanner.nextInt();
        int n_2 = scanner.nextInt();
        int n_3 = scanner.nextInt();
        int score = 0;


        for (int i = 1; i <= n_1 ; i++) {
            if (i % n_2 == 0 || i % n_3 == 0) {
                score += i;
            }
        }
        System.out.println(score);
    }
}
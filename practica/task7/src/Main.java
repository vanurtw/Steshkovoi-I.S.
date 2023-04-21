import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: n= ");
        int n = scan.nextInt();
        int n_1 = 0;
        int d = 9900;

        for (int i = 0; i <= n; i++) {
            int n_2 = i * i;
            int d_1 = Math.abs(n - n_2);

            if (d_1 < d) {
                d = d_1;
                n_1 = i;
            }
        }

        System.out.println("Ближайший квадрат: " + n_1);
    }
}
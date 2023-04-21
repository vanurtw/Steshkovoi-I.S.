import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        boolean sashaTurn = true;
        while (n > 1) {
            if (n % 2 == 0) {
                if (sashaTurn) {
                    n = n / 2;
                } else {
                    n = n - 1;
                }
            } else {
                n = n - 1;
            }
            sashaTurn = !sashaTurn;
        }
        if (sashaTurn) {
            System.out.println("Таня");
        } else {
            System.out.println("Саша");
        }
    }
}
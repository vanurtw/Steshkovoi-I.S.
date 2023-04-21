import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = (int) Math.sqrt(n);
        int b = a + 1;
        int d = b * b - a * a;

        if (d == n) {
            System.out.println(a * a + " " + a * a);
        } else {
            System.out.println(".....");
        }
    }
}
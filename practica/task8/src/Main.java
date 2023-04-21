import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длины трех отрезков:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a + b > c && b + c > a && c + a > b) {
            double a_1 = Math.acos((b * b + c * c - a * a) / (2.0 * b * c));
            double b_1 = Math.acos((c * c + a * a - b * b) / (2.0 * c * a));
            double c_1 = Math.acos((a * a + b * b - c * c) / (2.0 * a * b));
            double max = Math.max(a_1, Math.max(b_1, c_1));
            System.out.println("Можно составить треугольник. Наибольший угол: " + max);
        } else {
            System.out.println("невозможно составить треугольник");
        }
    }
}
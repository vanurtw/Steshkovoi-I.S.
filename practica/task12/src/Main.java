import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt();

        for (int i = s; i < n; i+=s) {

            int num = i;
            int square = num * num;
            System.out.print(square + " ");

        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        boolean flag = false;
        for (int i = 2; i <= Math.floor(num/2); i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(num + " не простое число");
        } else {
            System.out.println(num + "простое число");
        }
    }
}
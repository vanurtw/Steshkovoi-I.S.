import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        String s = scanner.nextLine();
        String[] s_1 = s.split("");
        int[] lst = new int[s.length()];
        for (int i = 0; i < s_1.length; i++) {
            lst[i] = Integer.parseInt(s_1[i]);
        }
        System.out.println(s_1);
        int sum = 0;

    }
}
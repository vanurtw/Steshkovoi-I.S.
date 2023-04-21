import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String str_1 = str.replaceAll("[aeiouAEIOUауоыиэяюёеАЕЁИОУЫЭЮЯ]", "");

        System.out.println(str_1);
    }
}
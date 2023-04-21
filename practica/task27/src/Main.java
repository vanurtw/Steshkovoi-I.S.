
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = scanner.nextInt();
        String direction = scanner.next();

        String string = "";
        for (int i = 0; i < str.length(); i++) {
            char symb = str.charAt(i);
            if (Character.isLetter(symb)) {
                if (direction.equals("right")) {
                    symb = (char) ((symb - 'a' + n) % 26 + 'a');
                } else if (direction.equals("left")) {
                    symb = (char) ((symb - 'a' - n + 26) % 26 + 'a');
                }
            }
            string += symb;
        }
        System.out.println(string);
    }
}
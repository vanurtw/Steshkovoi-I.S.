import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int upC = 0;
        int lowC = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                upC++;
            } else{
                lowC++;
            }
        }
        if (upC > lowC) {
            System.out.println(str.toUpperCase());
        } else{
            System.out.println(str.toLowerCase());
        }
    }
}
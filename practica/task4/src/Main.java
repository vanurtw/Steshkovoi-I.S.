import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String strin = "Hello";
        char ch = 'o';
        int count = count_str_symb(strin, ch);
        System.out.println(count);

    }

    public static int count_str_symb(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "7");
        map.put("2", "8");
        map.put("3", "9");
        map.put("7", "1");
        map.put("8", "2");
        map.put("9", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "6");
        map.put("0", "0");
        char c;
        String CharToString;
        String strin = "";
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            CharToString = Character.toString(c);
            strin += map.get(CharToString);
        }
        System.out.println(strin);
    }
}
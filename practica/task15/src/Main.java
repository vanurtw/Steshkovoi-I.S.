import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] str_list = str.split(" ");
        Set<String> unicStr = new LinkedHashSet<>(Arrays.asList(str_list));

        String output = String.join(" ", unicStr);
        System.out.println(output);
    }
}
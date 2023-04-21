import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String str = "56 65 74 100 99 68 86 180 90";
        String[] weights = str.split(" ");
        Arrays.sort(weights, Comparator.comparingInt(Main::sumDig).reversed());
        System.out.println(String.join(" ", weights));
    }

    private static int sumDig(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        return sum;
    }
}
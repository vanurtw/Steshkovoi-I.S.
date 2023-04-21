import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int high = 5;
        int weight = 4;
        int[][] array = new int[high][weight];
        for (int i = 0; i < high; i++) {
            for (int j = 0; j < weight; j++) {
                int n = Math.min(Math.min(i, j), Math.min(high - i - 1, weight - j - 1));
                array[i][j] = n + 1;
            }
        }

        try (FileWriter writer = new FileWriter("matrix.txt")) {
            for (int i = 0; i < high; i++) {
                for (int j = 0; j < weight; j++) {
                    writer.write(array[i][j] + " ");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
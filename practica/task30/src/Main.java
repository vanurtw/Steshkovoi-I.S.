import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {50, 55, 57, 58, 60};
        int d = 175;
        int n = 3;

        ArrayList<int[]> c = a(list, n);
        int maxSum = -1;
        for (int[] combo : c) {
            int sum = Arrays.stream(combo).sum();
            if (sum <= d && sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
    private static ArrayList<int[]> a(int[] arr, int n) {
        ArrayList<int[]> res = new ArrayList<>();
        int[] combo = new int[n];
        H(res, arr, combo, 0, 0);
        return res;
    }
    private static void H(ArrayList<int[]> res, int[] arr, int[] combo, int index, int start) {
        if (index == combo.length) {
            res.add(Arrays.copyOf(combo, combo.length));
        } else {
            for (int i = start; i < arr.length; i++) {
                combo[index] = arr[i];
                H(res, arr, combo, index + 1, i + 1);
            }
        }
    }
}
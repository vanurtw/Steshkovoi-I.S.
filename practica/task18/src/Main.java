import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] lst = {1, 2, 3, 4, 5, 9, 8, 7, 6, 5, 4};
        int maxIn = 0;
        for (int i = 1; i < lst.length; i++) {
            if (lst[i] > lst[maxIn]) {
                maxIn = i;
            }
        }
        int[] llst = Arrays.copyOfRange(lst, 0, maxIn);
        int[] rlst = Arrays.copyOfRange(lst, maxIn + 1, lst.length);
        System.out.println(Arrays.toString(rlst));
        System.out.println(Arrays.toString(llst));
    }
}
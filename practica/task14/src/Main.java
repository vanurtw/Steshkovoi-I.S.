import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list_n = new int[3];
        int index = 0;
        Scanner scan = new Scanner(System.in);

        while (index < list_n.length) {
            int n = scan.nextInt();

            if (index == 0 || n > list_n[index - 1]) {
                list_n[index] = n;
                index++;
            } else {
                for (int i = 0; i < index; i++) {
                    if (n < list_n[i]) {
                        for (int j = index - 1; j >= i; j--) {
                            list_n[j + 1] = list_n[j];
                        }
                        list_n[i] = n;
                        break;
                    }
                }
            }

        }
        System.out.println(list_n[0] + ", " + list_n[1] + ", " + list_n[2]);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String [] lst = str.split(" ");
        int sum = 0;
        int flag = 0;

        for (int i = Integer.parseInt(lst[0]); i < Integer.parseInt(lst[1]); i++) {
            flag = 0;
            for (int j = 2; j < lst.length; j++) {
                if (i % Integer.parseInt(lst[j]) == 0 ) flag++;
            }
            if (flag == lst.length - 2) sum+=i;
        }
        System.out.println(sum);
    }
}
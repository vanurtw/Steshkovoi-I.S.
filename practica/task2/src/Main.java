import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] piple_visit = {true, true, true, false, true, true, true, true, true, false, true, false, true, false, false, true, true, true, true, true, false, false, true, true};
        int count_1 = 0;
        for (int i = 0; i < piple_visit.length; i++) {
            if (piple_visit[i]) {
                count_1 += 1;
            }
        }
        System.out.println("кол-во сотрудников:" + count_1);
        Scanner scan = new Scanner(System.in);
        System.out.println("vvedi posledovatelnost v formate: 0 1 1 1 0...");
        String posled = scan.nextLine();
        String[] posled_list = posled.split(" ");
        int count_2 = 0;

        for (int i=0; i<posled_list.length; i++) {

            if (posled_list[i].trim().equals("1")){
                count_2++;
            }
        }
        System.out.println("кол-во сотрудников: " + count_2);

    }
}
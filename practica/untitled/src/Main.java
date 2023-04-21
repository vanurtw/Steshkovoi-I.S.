import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы:");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите кол-во строк");
        int rows = scanner1.nextInt();
        System.out.println("Введите кол-во колонн");
        int colums = scanner1.nextInt();

        int[][] matrix = new int[rows][colums];
        for (int i=0; i<rows; i++) {
            for (int j = 0; j < colums; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i=0; i<rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Транспонированная матрица: ");
        int [][] trans_matrix = new int[colums][rows];
        for (int i=0; i<colums; i++) {
            for (int j = 0; j < rows; j++) {
                trans_matrix[i][j] = matrix[j][i];
            }
        }
        for (int i=0; i<rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.print(trans_matrix[i][j]);
            }
            System.out.println();
        }

    }
}
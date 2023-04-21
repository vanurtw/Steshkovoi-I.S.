import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите текст");
        String userDits = scanner1.nextLine();
        FindAPalindrome palindrome = new FindAPalindrome();
        if (palindrome.isPalindrome(userDits)) {
            System.out.println("Данный текс является полиндромом. Наибольшая длина полиндрома составляет " + palindrome.countPolindrom());
        } else {
            System.out.println("Данный текст не является полиндромом. Наибольшая длина полиндрома составляет " + palindrome.countPolindrom());
        }

    }
    public class FindAPalindrome {
        public static int count = 0;
        public boolean isPalindrome(String word) {
            String checkBolean = "";
            int length = word.length();
            for (int i = 0; i < (length / 2); i++) {
                if (word.charAt(i) != word.charAt(length - i - 1)) {
                    checkBolean = "False";
                    continue;
                }
                count += 2;
            }
            if (checkBolean.equals("False")) {
                countPolindrom();
                return false;
            } else {
                countPolindrom();
                return true;
            }

        }
        public int countPolindrom() {
            return count;
        }
    }
}
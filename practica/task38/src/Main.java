public class Main {
    public static void main(String[] args) {
        String str = " я программирую фца пп ыр вкрв врквр";
        String[] lst = str.split("\\.\\s*");

        for (int i = 0; i < lst.length; i++) {
            String[] words = lst[i].split("\\s+");
            for (int j = 0; j < words.length; j++) {
                char firstLetter = words[j].charAt(0);
                String rest = words[j].substring(1);
                words[j] = rest + firstLetter + "ауч";
            }
            lst[i] = String.join(" ", words) + ".";
        }

        String result = String.join(" ", lst);
        System.out.println(result);
    }
}
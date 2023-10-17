import java.util.List;

public class StopGninnipSmySdroW {
    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
    }

    private static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }

}

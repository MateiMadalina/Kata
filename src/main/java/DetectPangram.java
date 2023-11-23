import java.util.HashSet;
import java.util.Set;

public class DetectPangram {
    public static void main(String[] args) {
        String pangram = "The quick brown fox jumps over the lazy dog.";
        System.out.println(check(pangram));
    }
    public static  boolean check(String sentence){
        Set<Character> letters = new HashSet<>();

        for (char currentChar : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(currentChar)) {
                letters.add(currentChar);
            }
        }

        return letters.size() == 26;
    }
}

import java.util.stream.IntStream;

public class FindTheMissingLetter {
    public static void main(String[] args) {
        char[] array = new char[]{'a', 'b', 'c', 'd', 'f'};
        System.out.println(findMissingLetter(array));
    }

    public static char findMissingLetter(char[] array) {
        char letter = array[0];
        for (char l : array) {
            if (l == letter) {
                letter++;
            } else {
                break;
            }
        }
        return letter;
    }
}

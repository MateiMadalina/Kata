import java.util.Arrays;
import java.util.stream.Collectors;

public class DecodeTheMorseCode {
    public static void main(String[] args) {
        System.out.println(decode("      ...---... -.-.--   - .... .   --.- ..- .. -.-. -.-   -... .-. --- .-- -.   ..-. --- -..-   .--- ..- -- .--. ...   --- ...- . .-.   - .... .   .-.. .- --.. -.--   -.. --- --. .-.-.-  \n"));
    }

    public static String decode(String morseCode) {
        StringBuilder result = new StringBuilder();
        String[] wordArrMorse = morseCode.split("   ");

        String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ",", ".", "?", "SOS","!"};

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--..", "...---...","-.-.--"};

        for (int i = 0; i < wordArrMorse.length; i++) {
            String[] letterMorse = wordArrMorse[i].split(" ");
            for (int x = 0; x < letterMorse.length; x++) {
                for (int j = 0; j < morse.length; j++) {
                    if (letterMorse[x].equals(morse[j])) {
                        result.append(english[j].toUpperCase());
                    }
                }
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}

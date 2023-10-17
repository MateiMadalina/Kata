import java.util.ArrayList;
import java.util.List;

public class NotVerySecure {
    public static void main(String[] args) {
        System.out.println(alphanumeric(""));

    }

    public static boolean alphanumeric(String s) {
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean isDigit = false;

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (Character.isUpperCase(character)) {
                upperCase = true;
            } else if (Character.isLowerCase(character)) {
                lowerCase = true;
            } else if (Character.isDigit(character)) {
                isDigit = true;
            }

            if (character == ' ' || character == '_') {
                return false;
            }
        }

        return upperCase && lowerCase && isDigit;
    }

}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        System.out.println(validPhoneNumber("(123) 456-7890"));
        System.out.println(validPhoneNumber("(123)456-7890"));

    }

    public static boolean validPhoneNumber(String phoneNumber) {
        String regex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}

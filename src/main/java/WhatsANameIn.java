import java.util.ArrayList;
import java.util.List;

public class WhatsANameIn {
    public static void main(String[] args) {
        System.out.println(nameInStr("Across the rivers", "chris"));
    }
    public static boolean nameInStr(String str, String name){
        int i = 0;

        for (char s: str.toCharArray()) {
            if (s == name.charAt(i)) i++;
        }

        return i == name.length();
    }
}

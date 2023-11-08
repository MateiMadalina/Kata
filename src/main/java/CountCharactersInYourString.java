import java.util.HashMap;
import java.util.Map;

public class CountCharactersInYourString {
    public static void main(String[] args) {
        System.out.println(count("aabbbc"));
    }

    public static Map<Character, Integer> count(String str) {
    Map<Character,Integer> result = new HashMap<>();
        for(int i=0; i<str.length();i++){
            result.compute(str.charAt(i), (key,oldValue)->(oldValue == null) ? 1 : oldValue + 1);
        }
        return result;
    }
}
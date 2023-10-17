import java.util.ArrayList;
import java.util.List;

public class WhatsANameIn {
    public static void main(String[] args) {
        System.out.println(nameInStr("v", "Madalina"));
    }
    public static boolean nameInStr(String str, String name){
        List<Character> letters = new ArrayList<Character>();
        for (Character c : str.toCharArray()) {
            for(Character ch : name.toCharArray()){
                if(c.equals(ch)) letters.add(ch);
            }
        }
        System.out.println(letters);
        return true;
    }
}

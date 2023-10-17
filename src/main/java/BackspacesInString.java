import java.util.ArrayList;
import java.util.List;

public class BackspacesInString {
    public static void main(String[] args) {
        System.out.println(cleanString("abc#d##c"));
    }

    private static String cleanString(String s) {
        List<String> buffer = new ArrayList<>();
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) != '#'){
                buffer.add(String.valueOf(s.charAt(i)));
            }
            else{
                if(buffer.size() > 0) buffer.remove(buffer.size()-1);
            }
        }

        String result = "";
        for(var i : buffer){
            result += i;
        }
        return result;
    }
}

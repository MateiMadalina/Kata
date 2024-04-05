import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineNumbering {
    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c")));
    }
    public static List<String> number(List<String> lines) {
            List<String> result =  new ArrayList<>();
            for(int i = 0 ; i < lines.size() ; i++){
                result.add((i+1) + ": " + lines.get(i));
            }
            return result;
        }

}

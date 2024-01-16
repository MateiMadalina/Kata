import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
    }

    public static String camelCase(String input) {
        List<String> inputList = new ArrayList<>();
        for(int i = 0 ; i < input.length() ; i++){
           if(Character.isUpperCase(input.charAt(i)))
           {
               inputList.add(" ");
           }
           inputList.add(String.valueOf(input.charAt(i)));
        }
        return inputList.stream().map(String::valueOf).collect(Collectors.joining());
    }
}

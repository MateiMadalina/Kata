import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitString{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abcdefgh")));
    }
    public static String[] solution(String s) {
        List<String> listResult = new ArrayList<>();
        String buffer = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(i % 2 == 0){
                listResult.add(buffer);
                buffer = "";
            }
            buffer = buffer + s.charAt(i);
        }
        if(s.length() % 2 != 0){
            listResult.add(s.charAt(s.length() -1) + "_");
        }else{
            listResult.add(buffer);
        }
        listResult.remove(0);
        return listResult.toArray(String[]::new);

    }
}

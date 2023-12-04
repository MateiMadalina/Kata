import java.util.ArrayList;
import java.util.List;

public class MakeTheDeadfishSwim {
    public static void main(String[] args) {
        System.out.println(parse("iiisdosodddddiso"));
    }

    public static int[] parse(String data) {
        int start = 0;
        List<Integer> resultAsList = new ArrayList<>();
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 'i') {
                start++;
            } else if (data.charAt(i) == 'd') {
                start--;
            } else if (data.charAt(i) == 's') {
                start = start * start;
            } else if (data.charAt(i) == 'o') {
                resultAsList.add(start);
            }
        }

        return resultAsList.stream().mapToInt(Integer::intValue).toArray();
    }
}

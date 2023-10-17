import java.util.ArrayList;
import java.util.List;

public class CountTheSmileyFaces {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add(":)");
        a.add("x-]");
        a.add(":ox");
        a.add(";-(");
        a.add(";-)");
        a.add(";~(");
        a.add(":~D");
        System.out.println(countSmileys(a));

    }

    public static int countSmileys(List<String> arr) {
        String validEmoji =  ":) ;) :-) :~) ;-) ;~) :D ;D :-D :~D ;~D ;~) ;-D";
        int counter = 0;
        for (var emoji : arr){
            if (validEmoji.contains(emoji)){
                counter++;
            }
        }
        return counter;
    }

}

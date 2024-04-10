import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimplePigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("O tempora o mores !"));
    }
    public static String pigIt(String str) {
//        String[] strArr = str.split(" ");
//        Character firstChar = null;
//        List<String> bufferList = new ArrayList<>();
//        String result = "";
//
//        for(String word : strArr){
//            String buffer = word;
//            if(!word.matches("[!?.]")){
//                for(int i = 0 ; i< word.length();i++){
//                    if(i==0){
//                        firstChar = word.charAt(i);
//                        buffer = buffer.substring(1);
//                    }
//                    if(i == word.lastIndexOf(word)) {
//                        buffer = buffer + firstChar + "ay";
//                    }
//                }
//            }
//            bufferList.add(buffer);
//        }
//        for(String elem : bufferList){
//           result += elem + " ";
//        }
//        return result.trim();

        return Arrays.stream(str.trim().split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
    }
}

import java.util.Arrays;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(toUnderScore("Calculating1Plus1Equals2"));
    }
    public static String toUnderScore(String name) {
        var arr = name.split("");
        for (var i = 1; i < arr.length-1; i++) {
            var nextChar = name.charAt(i+1);
            if(!arr[i].equals("_")){
                if(Character.isDigit(name.charAt(i))){
                    arr[i-1] = arr[i-1] + "_";
                }
                if(Character.isUpperCase(nextChar) ){
                    arr[i+1] = "_" + arr[i+1];
                }
            }
        }

        return String.join("", arr);
    }

}

import java.util.HashMap;

public class ConvertAHexStringToRGB {
    public static void main(String[] args) {
        System.out.println(hexStringToRGB("#111111"));
    }

    public static HashMap<String, Integer> hexStringToRGB(String hex) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        result.put("r", Integer.valueOf(hex.substring(1,3),16));
        result.put("g", Integer.valueOf(hex.substring(3,5),16));
        result.put("b", Integer.valueOf(hex.substring(5,7),16));
        return result;
    }
}

import java.util.HashMap;
import java.util.Map;

public class CharacterWithLongestConsecutiveRepetition {
    public static void main(String[] args) {
        Object[] result = longestRepetition("bbbaaabaaaa");
        for (var a : result) {
            System.out.println(a);
        }
    }

    public static Object[] longestRepetition(String s) {
        if (s == "") return new Object[]{"", 0};
        char maxChar = s.charAt(0);
        int maxLength = 1;

        char currentChar = maxChar;
        int currentLength = 1;

        for (int i = 1; i < s.length(); i++) {
            char nextChar = s.charAt(i);

            if (nextChar == currentChar) {
                currentLength++;
            } else {
                currentChar = nextChar;
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxChar = currentChar;
                maxLength = currentLength;
            }

        }

        return new Object[]{String.valueOf(maxChar), maxLength};

//        Map<String, Integer> letterCountDictionary = new HashMap<>();
//
//        for (String c : s.split("")) {
//            if (letterCountDictionary.containsKey(c)) {
//                int count = letterCountDictionary.get(c);
//                letterCountDictionary.put(c, count + 1);
//            } else {
//                letterCountDictionary.put(c, 1);
//            }
//        }
//
//        String key = null;
//        int maxValue = 0;
//        for (var c : letterCountDictionary.entrySet()) {
//            if (c.getValue() > maxValue) {
//                maxValue = c.getValue();
//                key = c.getKey();
//            }
//        }
//        return new Object[]{key, maxValue};
    }
}

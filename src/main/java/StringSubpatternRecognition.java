import java.util.*;
import java.util.stream.Collectors;

public class StringSubpatternRecognition {
    public static void main(String[] args) {
        System.out.println(hasSubpattern("<1[11222333Aa]a>"));
    }

    public static String hasSubpattern(String string) {
        Map<Character, Integer> charCounts = new HashMap<>();
        boolean areSameSize = true;

        for (char currentChar : string.toCharArray()) {
            charCounts.put(currentChar, charCounts.getOrDefault(currentChar, 0) + 1);
        }

        System.out.println(charCounts);

        int currentCount = charCounts.get(string.charAt(0));

        for (var entrySet : charCounts.entrySet()) {
            if (entrySet.getValue() != currentCount) {
                areSameSize = false;
                break;
            }
        }

        if (areSameSize) {
            System.out.println("aresamesize");
            return uniqueSorted(string);
        }
        
        char[] ar = string.toCharArray();
        Arrays.sort(ar);
        return String.valueOf(ar);
    }

    public static String uniqueSorted(String string) {
        List<String> uniqueLetter = new ArrayList<>();
        for (char currentChar : string.toCharArray()) {
            if (!uniqueLetter.contains(String.valueOf(currentChar))) {
                uniqueLetter.add(String.valueOf(currentChar));
            }
        }
        uniqueLetter = uniqueLetter.stream().sorted().collect(Collectors.toList());
        return uniqueLetter.stream().map(Object::toString).collect((Collectors.joining("")));
    }
}

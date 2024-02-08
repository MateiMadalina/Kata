import java.util.*;

public class MostFrequentlyUsedWordsInAText {
    public static void main(String[] args) {
        System.out.println(top3("''b '','','','' ' '.''B, x''x"));
    }

    public static List<String> top3(String s) {
        Map<String, Integer> wordCount = new HashMap<>();
        List<String> top3Words = new ArrayList<>();

        if(s == null || s.trim().isEmpty() || s.trim().replaceAll("'", "").isEmpty())
            return top3Words;

        String[] words = Arrays.stream(s.replaceAll("[^a-zA-Z\\s']", " ").trim().split("\\s+"))
                .map(String::toLowerCase)
                .toArray(String[]::new);

        for(var word : words){
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        wordCount.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .filter(entry -> !entry.getKey().equals(""))
                .forEach(entry -> top3Words.add(entry.getKey()));

//        if(top3Words.size() == 1 && top3Words.get(0).equals(""))return new ArrayList<>();
        return top3Words;
    }
}

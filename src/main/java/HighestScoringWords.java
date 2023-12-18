public class HighestScoringWords {
    public static void main(String[] args) {
        System.out.println(high("man i need a taxi up to ubud"));
    }

    public static String high(String s) {
        String[] words = s.split(" ");
        int maxScore = 0;
        int currentScorre = 0;
        String bestWordScore = words[0];
        for(String word: words){
            currentScorre = getWordScore(word);
            if(currentScorre > maxScore){
                bestWordScore = word;
                maxScore = currentScorre;
            }
        }
        return bestWordScore;
    }

    public static int getWordScore(String word){
        int[] pointPerLetter = new int[26];
        for(char letter = 'a'; letter <= 'z'; letter++){
            pointPerLetter[letter - 'a'] = letter - 'a' + 1;
        }
        int totalScore = 0;
        for(char letter : word.toLowerCase().toCharArray()){
            if(letter >= 'a' && letter <= 'z'){
                totalScore += pointPerLetter[letter - 'a'];
            }
        }
        return totalScore;
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactorialDecomposition {
    public static void main(String[] args) {
        System.out.println(decomp(17));
    }

    public static String decomp(int n) {
        Map<Integer, Integer> primeFactors = new HashMap<>();

        for (int i = 2; i <= n; i++) {
            int current = i;
            for (int j = 2; j <= current; j++) {
                while (current % j == 0) {
                    primeFactors.put(j, primeFactors.getOrDefault(j, 0) + 1);
                    current = current / j;
                }
            }
        }

        List<Map.Entry<Integer, Integer>> sortedFactors = new ArrayList<>(primeFactors.entrySet());
        sortedFactors.sort(Map.Entry.comparingByKey());

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : sortedFactors) {
            result.append(entry.getKey());
            if (entry.getValue() > 1) {
                result.append("^").append(entry.getValue());
            }
            result.append(" * ");
        }

        return result.substring(0, result.length() - 3);
    }

}

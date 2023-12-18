import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberInExpandedForm {
    public static void main(String[] args) {
        System.out.println(expandedForm(3507));
    }

    public static String expandedForm(int num) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < Integer.toString(num).length(); i++) {
//            if (Integer.toString(num).charAt(i) != '0') {
//                result.append((int) (Integer.parseInt(String.valueOf(Integer.toString(num).charAt(i))) * Math.pow(10, Integer.toString(num).length() - i - 1))).append(" + ");
//            }
//        }
//        return result.substring(0, result.length() - 3);

        String numString = Integer.toString(num);
        int length = numString.length();

        return IntStream.range(0, length)
                .mapToObj(i -> numString.charAt(i) != '0'
                        ? String.valueOf(numString.charAt(i) + "0".repeat(length - i - 1))
                        : null)
                .filter(Objects::nonNull)
                .collect(Collectors.joining(" + "));

    }
}

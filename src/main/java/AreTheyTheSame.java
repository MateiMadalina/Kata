import java.util.Arrays;

public class AreTheyTheSame {
    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));
    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }
        int[] squareA = Arrays.stream(a).map(x -> x * x).sorted().toArray();
        Arrays.sort(b);
        return Arrays.equals(squareA, b);
    }
}

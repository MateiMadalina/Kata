import java.util.Arrays;

public class FindOutlier {
    public static void main(String[] args) {
        System.out.println(find(new int[] {2, 6, 8, -10, 3}));
        System.out.println(find(new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
    }

    static int find(int[] integers) {
        int[] oddNumbers = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
        int[] evenNumbers = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();
        if(oddNumbers.length == 1) return oddNumbers[0];
        else return evenNumbers[0];
    }
}

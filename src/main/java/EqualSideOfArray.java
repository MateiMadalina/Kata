import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EqualSideOfArray {
    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[] {8,0}));
    }

    public static int findEvenIndex(int[] arr) {
        List<Integer> list
                = Arrays.stream(arr).boxed().collect(
                Collectors.toList());
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int leftSum = list.subList(0, i)
                    .stream()
                    .mapToInt(x -> x)
                    .sum();
            int rightSum = list.subList(i + 1, n)
                    .stream()
                    .mapToInt(x -> x)
                    .sum();

            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }
}

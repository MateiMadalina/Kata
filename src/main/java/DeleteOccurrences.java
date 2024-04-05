import java.util.*;


public class DeleteOccurrences {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[]{ 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3)));
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> listElements = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int element : elements) {
            int count = countMap.getOrDefault(element, 0);
            if (count < maxOccurrences) {
                listElements.add(element);
                countMap.put(element, count + 1);
            }
        }

        return listElements.stream().mapToInt(i -> i).toArray();
    }
}

import java.util.Arrays;
public class SumOfIntervals {
    public static void main(String[] args) {
        System.out.println(sumIntervals(new int[][]{{5, 8}, {3, 6}, {1, 2}}));
    }

    public static int sumIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int result = 0;
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (nextStart <= currentEnd) {
                currentEnd = Math.max(currentEnd, nextEnd);
            } else {
                result += currentEnd - currentStart;
                currentStart = nextStart;
                currentEnd = nextEnd;
            }
        }

        result += currentEnd - currentStart;

        return result;
    }
}

public class Bonuses {
    public static void main(String[] args) {
        System.out.println(bonus(new int[] {22, 3, 15}, 18228));
    }

    public static long[] bonus(int[] arr, long s) {
        long a = (s * arr[1] * arr[2]) / ((long) arr[1] * arr[2] + (long) arr[0] *arr[2] + (long) arr[0] * arr[1]);
        long b = (a * arr[0]) / arr[1];
        long c = (a * arr[0]) / arr[2];
        return new long[] {a,b,c};
    }
}

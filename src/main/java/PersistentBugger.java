public class PersistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(999));
    }

    private static int persistence(long n) {
        if (n < 10) {
            return 0;
        }
        long result = 1;
        while (n > 0) {
            long digit = n % 10;
            result *= digit;
            n /= 10;
        }
        return 1 + persistence(result);
    }
}

public class PersistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(999));
    }

    private static int persistence(long n) {
        int steps = 0;

        while (n >= 10) {
            long result = 1;
            while (n > 0) {
                result = result * (n % 10);
                n /= 10;
            }
            n = result;
            steps++;
        }

        return steps;
    }
}

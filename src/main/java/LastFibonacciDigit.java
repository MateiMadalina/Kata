public class LastFibonacciDigit {
    public static void main(String[] args) {
        System.out.println(lastFibDigit(34));
    }
    static int lastFibDigit(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int next = (prev + current) % 10;
            prev = current;
            current = next;
        }

        return current;
    }
}

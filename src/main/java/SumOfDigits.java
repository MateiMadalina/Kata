public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digit(998));
    }

    public static Integer digit(Integer n) {
        int sum = 0, m = 0;
        while (n > 0) {
            m = n % 10;
            sum = sum + m;
            n = n / 10;
        }
        if (sum < 10) {
            return sum;
        } else {
            return digit(sum);
        }
    }
}

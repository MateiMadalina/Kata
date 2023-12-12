public class ComparePowers {
    public static void main(String[] args) {
        System.out.println(comparePowers(new int[]{34,98 }, new int[]{51, 67}));
    }

    public static int comparePowers(int[] number1, int[] number2) {
        //Pentru orice numere reale pozitive daca log_a(x) < log_a(y) => a^x < a^y
        long base1 = number1[0];
        long exp1 = number1[1];
        long base2 = number2[0];
        long exp2 = number2[1];

        double log1 = exp1 * Math.log(base1);
        double log2 = exp2 * Math.log(base2);

        return Double.compare(log2, log1);
    }
}

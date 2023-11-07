import java.math.BigInteger;

public class PrimorialOfANumber {
    public static void main(String[] args) {
        System.out.println(numPrimorial(352));
    }

    public static String numPrimorial(int n) {
        BigInteger product = BigInteger.valueOf(2);
        int currentPrime = 3;
        int primesFound = 1;
        while (primesFound != n) {
            if (isPrime(currentPrime)) {
                product = product.multiply(BigInteger.valueOf(currentPrime));
                primesFound++;
            }
            currentPrime++;
        }
        return product.toString();
    }
    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}

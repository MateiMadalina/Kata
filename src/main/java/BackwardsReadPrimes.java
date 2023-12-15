import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BackwardsReadPrimes {
    public static void main(String[] args) {
        System.out.println(backwardsPrime(1, 100));
    }

    public static String backwardsPrime(long start, long end) {
        List<Integer> ascending = new ArrayList<>();
        for (int i = (int) start; i <= end; i++) {
            if (i > 9) {
                if(isPrime(i)){
                    ascending.add(i);
                }
            }
        }

        List<Integer> descending = new ArrayList<>();
        for (var nr : ascending) {
            int reversedNum = reverseNumber(nr);
            if (reversedNum != nr) {
                descending.add(reversedNum);
            }
        }

        List<Integer> reversedPrimes = new ArrayList<>();
        for (var num : descending) {
            if (isPrime(num)) {
                reversedPrimes.add(num);
            }
        }

        List<Integer> finalNumber = new ArrayList<>();
        for(var num : reversedPrimes){
            finalNumber.add(reverseNumber(num));
        }
        Collections.sort(finalNumber);

        StringBuilder result = new StringBuilder();
        for (var prime : finalNumber) {
            result.append(prime).append(" ");
        }

        return result.toString().trim();
    }

    private static int reverseNumber(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

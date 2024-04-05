import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(1652));
    }

    public static boolean isArmstrongNumber(int number) {
        int bufferNumber = number;
        List<Integer> digits = new ArrayList<>();
        while(bufferNumber > 0) {
            digits.add(bufferNumber % 10);
            bufferNumber /= 10;
        }
        int power = digits.size();
        int calculation = digits.stream().reduce(0,(subtotal, element) -> (int) (subtotal + Math.pow(element,power)));
        return calculation == number;
    }
}

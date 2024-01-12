import java.util.Arrays;

public class TheSupermarketQueue {
    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] currentCustomer;
        int[] remaingCustomer;
        int count = 0;

        if(n == 1) return Arrays.stream(customers).sum();
        else if(customers.length <= n){
            int maxCustomerTime = customers[0];
            for(int i = 0 ; i < customers.length; i++){
                if(customers[i] > maxCustomerTime){
                    maxCustomerTime = customers[i];
                }
            }
            return maxCustomerTime;
        } else {
            currentCustomer = Arrays.copyOfRange(customers, 0, n);
            remaingCustomer = Arrays.copyOfRange(customers, n, customers.length);
            while(Arrays.stream(currentCustomer).sum() > 0){
                for(int i = 0 ; i< currentCustomer.length; i++){
                    currentCustomer[i] = currentCustomer[i] - 1;

                    if(currentCustomer[i] == 0 && remaingCustomer.length>0){
                        currentCustomer[i] = remaingCustomer[0];
                        remaingCustomer = Arrays.copyOfRange(remaingCustomer, 1, remaingCustomer.length);
                    }
                }
                count++;
            }
            return count;
        }

    }
}

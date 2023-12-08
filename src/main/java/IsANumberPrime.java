public class IsANumberPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }

    public static boolean isPrime(int num) {
        //Generate time out in Codewars
//        if(num < 0 || num == 0 || num == 1) return false;
//        for(int i=2 ; i<num; i++){
//            if(num % i == 0){
//                return false;
//            }
//        }
//        return true;

        if(num < 2)
            return false;
        for (int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}

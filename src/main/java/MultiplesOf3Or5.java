public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }
    private static int solution(int number) {
        int sum = 0;
        for(int i=0;i<number;i++){
            if(i%3==0 || i%5==0 ){
                System.out.println(i);
                sum += i;
            }
        }
      return sum;
    }
}

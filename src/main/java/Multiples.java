import java.util.ArrayList;
import java.util.List;

public class Multiples {
    public int solution(int number) {
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

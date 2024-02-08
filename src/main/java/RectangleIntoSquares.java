import java.util.ArrayList;
import java.util.List;

public class RectangleIntoSquares {
    public static void main(String[] args) {
        System.out.println(sqInRect(5, 3));
    }
    public static List<Integer> sqInRect(int lng, int wdth) {
        List<Integer> sizesOfTheSquares = new ArrayList<>();

        while(lng != wdth){
            if(lng > wdth){
                lng = lng - wdth;
                sizesOfTheSquares.add(wdth);
            }else{
                wdth = wdth- lng;
                sizesOfTheSquares.add(lng);
            }
        }

        if(sizesOfTheSquares.size()>0){
            sizesOfTheSquares.add(lng);
            return sizesOfTheSquares;
        }
        return null;
    }
}

public class FindTheOddInt {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{2,2,3,3,3,5,5,1,1}));
    }
    public static int findIt(int[] a) {
        int countOcurence = 0;
        for(int nr: a){
            for(int checkNr:a){
                if(nr == checkNr){
                    countOcurence += 1;
                }
            }
            if(countOcurence % 2 != 0 ){
                return nr;
            }
        }
        return 0;
    }
}

public class FindTheOddInt {
    public static void main(String[] args) {

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

public class FindTheUniqueNumber {
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{0, 1, 0}));
    }

    public static double findUniq(double arr[]) {
        double first = arr[0];
        double last = arr[arr.length-1];
        for(int i = 0 ; i< arr.length ; i ++){
            if(last!= first){
                if(arr[i+1]!= first)
                return first;
                else return last;
            }else{
                if(first != arr[i]){
                    return arr[i];
                }
            }
        }
        return 0;
    }
}

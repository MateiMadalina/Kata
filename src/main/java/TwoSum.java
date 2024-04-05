public class TwoSum {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{1,2,3}, 4));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i = 0 ; i < numbers.length - 1; i++){
            for(int j = 1; j < numbers.length ; j++){
                if(numbers[i] + numbers[j] == target && i != j){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}

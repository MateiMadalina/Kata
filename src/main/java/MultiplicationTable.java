public class MultiplicationTable {
    public static void main(String[] args) {
        multiplicationTable(4);
    }

    public static int [][] multiplicationTable(int n){
        int [][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = (i + 1) * (j + 1);
            }
        }
        for(var arr : result){
            for(var nr : arr){
                System.out.println(nr);
            }
        }
        return result;
    }
}

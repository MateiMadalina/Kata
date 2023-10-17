import java.util.Arrays;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        List<List<Integer>> board = Arrays.asList(
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 1, 2),
                Arrays.asList(2, 1, 2)
        );

        System.out.println(checker(board));
    }

    private static int checker(List<List<Integer>> board){
        for (int i = 0; i < 3; i++) {
            if (board.get(i).get(0).equals(board.get(i).get(1)) && board.get(i).get(1).equals(board.get(i).get(2)) && board.get(i).get(0) > 0) return board.get(i).get(0);
            else if (board.get(0).get(i).equals(board.get(1).get(i)) && board.get(1).get(i).equals(board.get(2).get(i)) && board.get(0).get(i) > 0) return board.get(0).get(i);
        }

        if (board.get(0).get(0).equals(board.get(1).get(1)) && board.get(1).get(1).equals(board.get(2).get(2)) && board.get(0).get(0) > 0) return board.get(0).get(0);
        if (board.get(0).get(2).equals(board.get(1).get(1)) && board.get(1).get(1).equals(board.get(2).get(0)) && board.get(0).get(2) > 0) return board.get(0).get(2);

        if (board.stream().flatMap(List::stream).anyMatch(n -> n == 0)) return -1;
        else return 0;
    }
}

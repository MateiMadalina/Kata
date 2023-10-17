import java.util.List;

public class TicTacToe {
    private final List<List<Integer>> board;

    public TicTacToe(List<List<Integer>> board) {
        this.board = board;
    }

    public int checker(){
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

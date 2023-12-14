public class SudokuValidator {
    public static void main(String[] args) {
        int[][] invalidBoard = {
                {8, 4, 7, 2, 6, 5, 1, 0, 3},
                {1, 3, 6, 7, 0, 8, 2, 4, 5},
                {0, 5, 2, 1, 4, 3, 8, 6, 7},
                {4, 2, 0, 6, 7, 1, 5, 3, 8},
                {6, 7, 8, 5, 3, 2, 0, 1, 4},
                {3, 1, 5, 4, 8, 0, 7, 2, 6},
                {5, 6, 4, 0, 1, 7, 3, 8, 2},
                {7, 8, 1, 3, 2, 4, 6, 5, 0},
                {2, 0, 3, 8, 5, 6, 4, 7, 1}
        };
        System.out.println(validate(invalidBoard));
    }

    public static boolean validate(int[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) {
            return false;
        }

        // Check rows and columns
        for (int i = 0; i < 9; i++) {
            if (!isValidGroup(board[i]) || !isValidGroup(getColumn(board, i))) {
                return false;
            }
        }

        // Check 3x3 sub-grids
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidGroup(getSubgrid(board, i, j))) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValidGroup(int[] group) {
        boolean[] seen = new boolean[9]; // 1 to 9
        for (int value : group) {
            if (value < 1 || value > 9 || seen[value - 1]) {
                return false;
            }
            seen[value - 1] = true;
        }
        return true;
    }

    private static int[] getColumn(int[][] board, int col) {
        int[] column = new int[9];
        for (int i = 0; i < 9; i++) {
            column[i] = board[i][col];
        }
        return column;
    }

    private static int[] getSubgrid(int[][] board, int startRow, int startCol) {
        int[] subgrid = new int[9];
        int index = 0;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                subgrid[index++] = board[i][j];
            }
        }
        return subgrid;
    }
}

public class MultidimensionalHomework {

    public static void main(String[] args) {

        char[][] corner = new char[8][8];
        for (int i = 0; i < corner.length; i++) {
            for (int j = 0; j < corner[i].length; j++) {
                if (i == j || j + i == corner.length-1) {
                    corner[i][j] = 'X';
                } else {
                    corner[i][j] = 'Y';
                }
                System.out.print(corner[i][j] + " ");


            }
            System.out.println();
        }

        char [][] board = new char[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i + j) % 2 == 0){
                    board[i][j] = 'X';
                }
                else {
                    board[i][j] = '0';

                }
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }

    }
}

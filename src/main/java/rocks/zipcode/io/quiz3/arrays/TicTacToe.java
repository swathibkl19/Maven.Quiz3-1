package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board =board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {

        return board[value];
    }

    public String[] getColumn(Integer value) {

        String[] column = new String[board.length];

        for(int row =0;row <board.length ;row++) {

            column[row] = board[row][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {

        String[] row = getRow(rowIndex);

        return sameValuesOnBoard(row);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        String[] col =getColumn(columnIndex);

        return sameValuesOnBoard(col);
    }

    public Boolean sameValuesOnBoard (String[] value){

        for( int i = 0; i < value.length ; i++ ){
            if(!value[i].equals(value[0])){
                return false;
            }
        }
        return true;
    }
    public String[] getDiagonal(){
        String[] diagonal = new String[board.length];
        for (int i = 0; i < board.length; i++) {
            diagonal[i] = board[i][i];
        }
        return diagonal;
    }

    public String[] getOtherDiagonal(){
        String[] diagonal = new String[board.length];
        for (int i = 0; i < board.length; i++) {
            int row = board.length - 1 - i;
            diagonal[i] = board[row][i];
        }
        return diagonal;
    }

    public String getWinner() {

        for (int i = 0; i < board.length; i++) {
            if (isRowHomogenous(i)) {
                return board[i][0];
            }
        }
        for(int i =0; i<board.length ;i++ ){
            if(isColumnHomogeneous(i)){
                return board[0][i];
            }
        }

        String[] diagonal = getDiagonal();
        if (sameValuesOnBoard(diagonal)) {
            return diagonal[0];
        }
            String[] otherDiagonal = getOtherDiagonal();
            if (sameValuesOnBoard(otherDiagonal)) {
                return otherDiagonal[0];
            }

            return null;
        }

    public String[][] getBoard() {

        return null;
    }
}

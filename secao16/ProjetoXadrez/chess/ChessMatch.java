package secao16.ProjetoXadrez.chess;

import secao16.ProjetoXadrez.boardgame.Board;
import secao16.ProjetoXadrez.chess_pieces.*;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }

    public void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column,row).toPosition());
    }

    private void initialSetup(){
        placeNewPiece('a',1,new Rook(board,Color.WHITE));
        placeNewPiece('h',1,new Rook(board,Color.WHITE));
        placeNewPiece('a',8,new Rook(board,Color.BLACK));
        placeNewPiece('h',8,new Rook(board,Color.BLACK));
        placeNewPiece('g',8,new Rook(board,Color.WHITE));
        placeNewPiece('e',1,new King(board,Color.WHITE));
        placeNewPiece('e',8,new King(board,Color.BLACK));
    }
}

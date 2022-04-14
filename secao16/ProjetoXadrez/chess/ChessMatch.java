package secao16.ProjetoXadrez.chess;

import secao16.ProjetoXadrez.boardgame.Board;
import secao16.ProjetoXadrez.boardgame.Position;
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

    private void initialSetup(){
        board.placePiece(new Rook(board,Color.WHITE), new Position(0, 0));
        board.placePiece(new Rook(board,Color.WHITE), new Position(0, 7));
        board.placePiece(new Rook(board,Color.BLACK), new Position(7, 0));
        board.placePiece(new Rook(board,Color.BLACK), new Position(7, 7));
        board.placePiece(new King(board,Color.WHITE), new Position(0, 4));
        board.placePiece(new King(board,Color.BLACK), new Position(7, 4));
    }
}

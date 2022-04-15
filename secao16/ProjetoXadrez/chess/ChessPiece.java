package secao16.ProjetoXadrez.chess;

import secao16.ProjetoXadrez.boardgame.Board;
import secao16.ProjetoXadrez.boardgame.Piece;

public class ChessPiece extends Piece{
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}

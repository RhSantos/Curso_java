package secao16.ProjetoXadrez.src.chess;

import secao16.ProjetoXadrez.src.boardgame.Board;
import secao16.ProjetoXadrez.src.boardgame.Piece;

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

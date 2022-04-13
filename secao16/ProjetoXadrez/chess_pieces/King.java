package secao16.ProjetoXadrez.chess_pieces;

import secao16.ProjetoXadrez.boardgame.Board;
import secao16.ProjetoXadrez.chess.ChessPiece;
import secao16.ProjetoXadrez.chess.Color;

public class King extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
    
}

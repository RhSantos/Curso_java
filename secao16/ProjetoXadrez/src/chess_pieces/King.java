package secao16.ProjetoXadrez.src.chess_pieces;

import secao16.ProjetoXadrez.src.boardgame.Board;
import secao16.ProjetoXadrez.src.chess.ChessPiece;
import secao16.ProjetoXadrez.src.chess.Color;

public class King extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
    
}
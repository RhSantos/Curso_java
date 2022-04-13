package secao16.ProjetoXadrez.application;

import secao16.ProjetoXadrez.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}

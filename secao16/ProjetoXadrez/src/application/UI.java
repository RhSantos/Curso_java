package secao16.ProjetoXadrez.src.application;

import secao16.ProjetoXadrez.src.chess.ChessPiece;
import secao16.ProjetoXadrez.src.chess.Color;

public class UI {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String LIGHT = "\033[48;5;242m";
    public static final String DARK = "\033[48;5;247m";

    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print(ANSI_YELLOW + (8 - i)+ ANSI_RESET + " ");
            for (int j = 0; j < pieces.length; j++) {
                if(i % 2 == 0){
                    if(j % 2 == 0)
                        System.out.print(ANSI_RESET+DARK);
                    else 
                        System.out.print(ANSI_RESET+LIGHT);
                }
                else{
                    if(j % 2 == 0)
                        System.out.print(ANSI_RESET+LIGHT);
                    else 
                        System.out.print(ANSI_RESET+DARK);      
                }
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println(ANSI_YELLOW +"  a b c d e f g h"+ ANSI_RESET);
    }

    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-"+ANSI_RESET);
        }
        else {
            if (piece.getColor() == Color.WHITE) {
                System.out.print(ANSI_WHITE + piece + ANSI_RESET);

            }
            else {
                System.out.print(ANSI_BLACK + piece + ANSI_RESET);
            }
        }
        System.out.print(" ");
	}
}

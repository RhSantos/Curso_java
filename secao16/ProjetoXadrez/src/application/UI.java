package secao16.ProjetoXadrez.src.application;

import secao16.ProjetoXadrez.src.chess.ChessPiece;
import secao16.ProjetoXadrez.src.chess.Color;

public class UI {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";

    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print(ANSI_YELLOW + (8 - i)+ ANSI_RESET + " ");
            System.out.print(GREEN_BACKGROUND_BRIGHT);
            for (int j = 0; j < pieces.length; j++) {
                if(i % 2 == 0){
                    if(j % 2 == 0)
                        System.out.print(ANSI_RESET+ANSI_BLUE_BACKGROUND);
                    else 
                        System.out.print(ANSI_RESET+GREEN_BACKGROUND_BRIGHT);
                }
                else{
                    if(j % 2 == 0)
                        System.out.print(ANSI_RESET+GREEN_BACKGROUND_BRIGHT);
                    else 
                        System.out.print(ANSI_RESET+ANSI_BLUE_BACKGROUND);      
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

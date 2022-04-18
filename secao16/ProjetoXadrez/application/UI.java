package secao16.ProjetoXadrez.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import secao16.ProjetoXadrez.chess.ChessPiece;
import secao16.ProjetoXadrez.chess.ChessPosition;
import secao16.ProjetoXadrez.chess.Color;

public class UI {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String LIGHT = "\033[48;5;242m";
    public static final String DARK = "\033[48;5;247m";

    public static ChessPosition readChessPosition(Scanner sc){
        try{
            String s = sc.nextLine();
            char column = s.charAt(0);
            int row = Integer.parseInt(s.substring(1));
            return new ChessPosition(column, row);
        }
        catch(RuntimeException e){
            throw new InputMismatchException("Error reading ChessPosition."+ 
                "Valid values are from a1 to h8.");
        }
    }

    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print(ANSI_RESET +ANSI_YELLOW + (8 - i)+ ANSI_RESET + " ");
            for (int j = 0; j < pieces.length; j++) {
                String bg = colorBoard(i,j);
                printPiece(pieces[i][j],bg);
                if(j == pieces.length-1)
                    System.out.print(ANSI_RESET);
            }
            System.out.println();
        }
        System.out.println(ANSI_RESET+ANSI_YELLOW +"  a b c d e f g h"+ANSI_RESET);
    }

    public static String colorBoard(int i,int j){
        if(i % 2 == 0){
            if(j % 2 == 0){
                System.out.print(DARK);
                return DARK;
            }
            else {
                System.out.print(LIGHT);
                return LIGHT;
            }
        }
        else{
            if(j % 2 == 0){
                System.out.print(LIGHT);
                return LIGHT;
            }
            else {
                System.out.print(DARK);   
                return DARK;   
            }
        }
    }

    private static void printPiece(ChessPiece piece,String bg) {
        if (piece == null) {
            System.out.print(" ");
            
        }
        else {
            if (piece.getColor() == Color.WHITE) {
                System.out.print(ANSI_WHITE+ piece+ANSI_RESET+bg);

            }
            else {
                System.out.print(ANSI_BLACK+ piece+ANSI_RESET+bg);
            }
        }
        System.out.print(" ");
	}
}

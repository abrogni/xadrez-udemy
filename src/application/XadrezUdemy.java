package application;

import boardgame.Board;
import chess.ChessMatch;

public class XadrezUdemy {

    public static void main(String[] args) {
        
        ChessMatch chessmMatch = new ChessMatch();
        UI.printBoard(chessmMatch.getPieces());
        
    }
    
}

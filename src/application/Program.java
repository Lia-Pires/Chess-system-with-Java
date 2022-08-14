package application;

import java.util.Scanner;
import chess.ChessMatch;
import chess.ChessPosition;
import chess.ChessPiece;
import chess.ChessException;
import java.util.InputMismatchException;


public class Program {
	Scanner sc = new Scanner(System.in)

	ChessMatch chessMatch = new ChessMatch();

	while (true) {
		try {
			UI.clearScreen();
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);

			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);

			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
		catch (ChessException e) {
			System.out.println(e.getMessage());
			sc.nextLine();
		}
		catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			sc.nextLine();
		}



		}
	}

}
		
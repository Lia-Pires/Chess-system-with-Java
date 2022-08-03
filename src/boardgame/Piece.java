package boardgame;

public class Piece {

		protected Position position;
		private Board board;
		
		
		public Piece() {
			
		}
		
		public Piece(Board board) {
			this.board = board;
			position = null;  // Already is null by standard;
		}
		
			
		protected Board getBoard() {
			return board;
		}

		
//		public boolean possibleMoves() {
//			
//		}
//		
//		public boolean possibleMove(Position position) {
//			
//		}
//		
//		public boolean isThereAnyPossibleMove() {
//			
//		}
		
		
}

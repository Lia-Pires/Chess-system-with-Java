package chess;

public class ChessPosition {
	
	private char column;
	private int row;
	
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8 ){
			throw new ChessException("Error instanciation ChessPosition. Valid values are from A1 to H8!"); 
		}
		this.column = column;
		this.row = row;
	}
	
	
	

}

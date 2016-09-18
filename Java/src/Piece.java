import java.util.ArrayList;
import java.util.HashMap;

public class Piece extends Tile{
	// available positions to go to from current position
	int[][] availPositions;
	public HashMap<Integer, Piece> pieceArray = new HashMap<Integer, Piece>();
	/*
	 1 - rook
	 2 - knight
	 3 - bishop
	 4 - king
	 5 - queen
	 6 - pawn
	 */
	private int typeOfPiece;
	private boolean isWhite;
	public Piece(int x, int y) {
		super(x, y);
	}

	public int getTypeOfPiece() {
		return typeOfPiece;
	}

	public void setTypeOfPiece(int typeOfPiece) {
		this.typeOfPiece = typeOfPiece;
	}

	public boolean isWhite() {
		return isWhite;
	}

	public void setWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}
	
	public void createPieceArray(HashMap<Integer, Piece> pieceArray)
	{
		for(int i = 11; i < 88; i++)
		{
			pieceArray.put(i, null);
		}
	}
	
	public void removeFromBoard(int x, int y)
	{
		int pos = Integer.parseInt(x + "" + y);
		pieceArray.replace(pos, null);
	}
}

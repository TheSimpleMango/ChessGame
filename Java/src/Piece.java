import java.util.ArrayList;
import java.util.HashMap;

public class Piece extends Tile{
	Position position;
	//Board spaces are numbered from 1 to 64 starting in the bottom left corner and ending in the top corner. At the
	/*
	 0 - rook
	 1 - knight
	 2 - bishop
	 3 - king
	 4 - queen
	 5 - pawn
	 */
	private int typeOfPiece;
	private boolean isWhite;
	public Piece() {
		
	}

	public Position getPosition() {
		return position;
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
}

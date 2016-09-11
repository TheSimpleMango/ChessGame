import java.util.ArrayList;
import java.util.HashMap;

public class Piece extends Tile{
	int position;
	int spacesAbleToMoveForwards;
	int spacesAbleToMoveRight;
	int spacesAbleToMoveBackwards;
	int spacesAbleToMoveLeft;//Board spaces are numbered from 1 to 64 starting in the bottom left corner and ending in the top corner. At the
	int[] boardPositions = new int[64];//end of the row (the right), the numbering carries back over to the left side of the next row. So, the
	Piece[] boardPieces = new Piece[64];//space directly above space 1 is space 9, not space 16.

	public Piece() {
		for (int i = 0; i < 64; i++) {
			boardPositions[i] = i;
		}
	}
	
	public boolean getColor()
	{
		return true;
	}

	public Position getPosition() {
		// TODO Auto-generated method stub
		return position;
	}

	public void removeFromBoard() {
		// TODO Auto-generated method stub
		boardPieces[position] = null;
	}
}

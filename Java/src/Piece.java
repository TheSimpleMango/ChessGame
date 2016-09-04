import java.util.ArrayList;
import java.util.HashMap;

public class Piece {
	int position;
	int[] boardPositions = new int[64];
	Object[] boardPieces = new Object[64];

	public Piece() {
		for (int i = 0; i < 64; i++) {
			boardPositions[i] = i;
		}
	}

	public int getPosition() {
		// TODO Auto-generated method stub
		return position;
	}

	public void removeFromBoard() {
		// TODO Auto-generated method stub
		boardPieces[position] = null;
	}
}

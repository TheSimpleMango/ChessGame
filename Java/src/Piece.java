import java.util.ArrayList;
import java.util.HashMap;

public abstract class Piece {
	int position;
	int[] boardPositions = new int[64];
	Object[] boardPieces = new Object[64];

	public abstract int getPosition();

	public abstract void move(int spacesForwards, int spacesRight);

	public abstract void removeFromBoard();

	public abstract void setPosition(int position);

	public abstract void createBoard(int[] boardPositions, Object[] boardPieces);
}

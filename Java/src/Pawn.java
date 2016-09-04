import java.util.ArrayList;

public class Pawn extends Piece {
	Pawn pawn = new Pawn();

	@Override
	public int getPosition() {
		// TODO Auto-generated method stub
		return position;
	}

	public void move(int spacesForwards, int spacesRight) {
		// TODO Auto-generated method stub
		int newPosition = 0;
		if (spacesForwards > 0) {
			newPosition = position + spacesForwards * 8;
		} else if (spacesForwards < 0) {
			newPosition = position - spacesForwards * 8;
		}
		if (boardPieces[newPosition] == null) {
			setPosition(newPosition);
		} else {
			System.out.println("Tile already occupied.");
		}
	}

	public void setPosition(int position) {
		// TODO Auto-generated method stub
		removeFromBoard();
		this.position = position;
		boardPieces[position] = pawn;
	}
	
	public void takePiece()
	{
		
	}
}

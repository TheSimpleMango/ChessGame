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
		removeFromBoard();
		if (spacesForwards > 1) {
			position = position - spacesForwards * 8;
		} else if (spacesForwards < 0) {
			position = position + spacesForwards * 8;
		}
	}

	public void setPosition(int position) {
		// TODO Auto-generated method stub
		this.position = position;
		if (boardPieces[position] == null) {
			boardPieces[position] = pawn;
		} else {
			System.out.println("Tile already occupied.");
		}
	}
}

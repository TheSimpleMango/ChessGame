import java.util.ArrayList;

public class Pawn extends Piece {
	Pawn pawn = new Pawn();

	@Override
	public int getPosition() {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public void move(int spacesForwards, int spacesRight) {
		// TODO Auto-generated method stub
		removeFromBoard();
		if (spacesForwards > 1) {
			position = position - spacesForwards * 8;
		} else if (spacesForwards < 0) {
			position = position + spacesForwards * 8;
		}
	}

	@Override
	public void removeFromBoard() {
		// TODO Auto-generated method stub
		boardPieces[position] = null;
	}

	@Override
	public void setPosition(int position) {
		// TODO Auto-generated method stub
		this.position = position;
		if (boardPieces[position] == null) {
			boardPieces[position] = pawn;
		} else {
			System.out.println("Tile already occupied.");
		}
	}

	@Override
	public void createBoard(int[] boardPositions, Object[] boardPieces) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 64; i++) {
			boardPositions[i] = i;
		}
	}

}


public class Rook extends Piece {
	Rook rook = new Rook();

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
		newPosition = 0;
		if (spacesRight > 0) {
			newPosition = position + spacesRight;
		} else if (spacesForwards < 0) {
			newPosition = position - spacesForwards * 8;
		}
		if (boardPieces[newPosition] == null) {
			setPosition(newPosition);
		} else {
			System.out.println("Tile already occupied.");
		}
	}

	@Override
	public void removeFromBoard() {
		// TODO Auto-generated method stub
		boardPieces[position] = null;
	}

	public void setPosition(int position) {
		// TODO Auto-generated method stub
		removeFromBoard();
		this.position = position;
		boardPieces[position] = rook;
	}
}


public class Rook extends Piece {
	Rook rook = new Rook();

	@Override
	public int getPosition() {
		// TODO Auto-generated method stub
		return position;
	}

	public void move(int spacesForwards, int spacesRight) {
		// TODO Auto-generated method stub
		if (spacesAbleToMoveForwards >= spacesForwards && spacesAbleToMoveRight >= spacesRight
				&& spacesAbleToMoveBackwards <= spacesRight && spacesAbleToMoveLeft <= spacesRight) {
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
			} else if (spacesRight < 0) {
				newPosition = position - spacesRight;
			}
			if (boardPieces[newPosition] == null) {
				setPosition(newPosition);
			} else {
				System.out.println("Tile already occupied.");
			}
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
		for (int i = 8; i < 65; i = i + 8) {
			if (position > i - 8 && position < i) {
				spacesAbleToMoveForwards = (64 - i) / 8;
				spacesAbleToMoveBackwards = 7 - spacesAbleToMoveForwards;
				spacesAbleToMoveRight = i - position;
				spacesAbleToMoveLeft = 7 - spacesAbleToMoveRight;
			}
		}
	}
}

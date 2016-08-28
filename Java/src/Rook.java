
public class Rook extends Piece {
	Rook rook = new Rook();

	public void move(int spacesForwards, int spacesRight) {
		// TODO Auto-generated method stub
	}

	@Override
	public void removeFromBoard() {
		// TODO Auto-generated method stub
		boardPieces[position] = null;
	}

	public void setPosition(int position) {
		// TODO Auto-generated method stub
		this.position = position;
		if (boardPieces[position] == null) {
			boardPieces[position] = rook;
		} else {
			System.out.println("Tile already occupied.");
		}
	}
}

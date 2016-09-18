public class Knight extends Piece {
	int x;
	int y;
	int typeOfPiece;
	boolean isWhite;
	int moves = 0;

	public Knight(int x, int y, int typeOfPiece, boolean isWhite) {
		super(x, y);
		this.x = x;
		this.y = y;
		this.typeOfPiece = typeOfPiece;
		this.isWhite = isWhite;
		setPosition(x, y);
	}

	private void setPosition(int xPos, int yPos) {
		// TODO Auto-generated method stub
		int pos = Integer.parseInt(xPos + "" + yPos);
		Piece piece = pieceArray.get(pos);
		if (piece == null) {
			pieceArray.replace(pos, knight);
		} else {
			System.out.println("There is already a piece here.");
		}
	}

	Knight knight = new Knight(x, y, typeOfPiece, isWhite);

	public void move(int newX, int newY) {
		int pos = Integer.parseInt(newX + "" + newY);
		Piece piece = pieceArray.get(pos);
		if ((newY == y + 2 && newX == x + 1) || (newY == y + 2 && newX == x - 1) || (newY == y - 2 && newX == x + 1)
				|| (newY == y - 2 && newX == x - 1) || (newY == y + 1 && newX == x + 2)
				|| (newY == y + 1 && newX == x - 2) || (newY == y - 1 && newX == x + 2)
				|| (newY == y - 1 && newX == x - 2)) {
			if (piece == null) {
				pieceArray.replace(pos, knight);
				moves++;
			} else {
				if ((piece.isWhite() == true && knight.isWhite == false)
						|| (piece.isWhite() == false && knight.isWhite == true)) {
					removeFromBoard(newX, newY);
					pieceArray.replace(pos, knight);
					moves++;
				} else {
					System.out.println("You can't move there.");
				}
			}
		} else {
			System.out.println("You can't move there.");
		}
	}
}

public class King extends Piece {
	int x;
	int y;
	int typeOfPiece;
	boolean isWhite;
	int moves = 0;

	public King(int x, int y, int typeOfPiece, boolean isWhite) {
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
			pieceArray.replace(pos, king);
		} else {
			System.out.println("There is already a piece here.");
		}
	}

	King king = new King(x, y, typeOfPiece, isWhite);

	public void move(int newX, int newY) {
		int pos = Integer.parseInt(newX + "" + newY);
		Piece piece = pieceArray.get(pos);
		if (newY == y + 1 || newY == y - 1 || newX == x + 1|| newX == x - 1) {
			if (piece == null) {
				pieceArray.replace(pos, king);
				moves++;
			} else {
				if ((piece.isWhite() == true && king.isWhite == false)
						|| (piece.isWhite() == false && king.isWhite == true)) {
					removeFromBoard(newX, newY);
					pieceArray.replace(pos, king);
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

public class Bishop extends Piece {
	int x;
	int y;
	int typeOfPiece;
	boolean isWhite;
	int moves = 0;

	public Bishop(int x, int y, int typeOfPiece, boolean isWhite) {
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
			pieceArray.replace(pos, bishop);
		} else {
			System.out.println("There is already a piece here.");
		}
	}

	Bishop bishop = new Bishop(x, y, typeOfPiece, isWhite);

	public void move(int newX, int newY) {
		int pos = Integer.parseInt(newX + "" + newY);
		Piece piece = pieceArray.get(pos);
		if (Math.abs(newY) == Math.abs(newX)) {
			if (piece == null) {
				pieceArray.replace(pos, bishop);
				moves++;
			} else {
				if ((piece.isWhite() == true && bishop.isWhite == false)
						|| (piece.isWhite() == false && bishop.isWhite == true)) {
					removeFromBoard(newX, newY);
					pieceArray.replace(pos, bishop);
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

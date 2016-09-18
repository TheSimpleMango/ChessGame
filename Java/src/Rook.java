
public class Rook extends Piece {
	int x;
	int y;
	int typeOfPiece;
	boolean isWhite;
	int moves = 0;

	public Rook(int x, int y, int typeOfPiece, boolean isWhite) {
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
			pieceArray.replace(pos, rook);
		} else {
			System.out.println("There is already a piece here.");
		}
	}

	Rook rook = new Rook(x, y, typeOfPiece, isWhite);

	public void move(int newX, int newY) {
		int pos = Integer.parseInt(newX + "" + newY);
		Piece piece = pieceArray.get(pos);
		if (newY == y || newX == x) {
			if (piece == null) {
				pieceArray.replace(pos, rook);
				moves++;
			} else {
				if ((piece.isWhite() == true && rook.isWhite == false)
						|| (piece.isWhite() == false && rook.isWhite == true)) {
					removeFromBoard(newX, newY);
					pieceArray.replace(pos, rook);
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

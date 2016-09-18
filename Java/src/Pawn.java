
public class Pawn extends Piece {
	int x;
	int y;
	int typeOfPiece;
	boolean isWhite;
	int moves = 0;

	public Pawn(int x, int y, int typeOfPiece, boolean isWhite) {
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
			pieceArray.replace(pos, pawn);
		} else {
			System.out.println("There is already a piece here.");
		}
	}

	Pawn pawn = new Pawn(typeOfPiece, typeOfPiece, typeOfPiece, isWhite);

	public void move(int newX, int newY) {
		int pos = Integer.parseInt(newX + "" + newY);
		Piece piece = pieceArray.get(pos);
		if ((newY == y + 1) || (newY == y + 2 && moves == 0)) {
			if (piece == null) {
				pieceArray.replace(pos, pawn);
				moves++;
			} else {
				if ((piece.isWhite() == true && pawn.isWhite == false)
						|| (piece.isWhite() == false && pawn.isWhite == true)) {
					removeFromBoard(newX, newY);
					pieceArray.replace(pos, pawn);
					moves++;
				} else {
					System.out.println("You can't move there.");
				}
			}
		}
	}
}

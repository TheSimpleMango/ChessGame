import java.util.ArrayList;

public class Player {
	String name;
	public ArrayList<Piece> pieces = new ArrayList<Piece>();
	// you may change the whole arraylist by using setPieces or just use
	// (playername).pieces.add(Piece piece);
	// or
	// (playername).pieces.remove(Piece piece);

	Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(ArrayList<Piece> pieces) {
		this.pieces = pieces;
	}

	public void removePiece(Piece p) {
		pieces.remove(p);
	}

	public void addPiece(Piece p) {
		pieces.add(p);
	}
}

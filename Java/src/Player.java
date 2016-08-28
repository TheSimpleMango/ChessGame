import java.awt.Color;
import java.util.ArrayList;

public class Player {
	String name;
	Color color;
	boolean turn; // True if it is the player's turn. False otherwise
	public ArrayList<Piece> pieces = new ArrayList<Piece>();
	// you may change the whole arraylist by using setPieces or just use
	// (playername).pieces.....

	Player(String name, Color color) {
		this.name = name;
		this.color = color;

	}

	Player(String name, String color) {
		this.name = name;
		if (color.equalsIgnoreCase("black")) {
			this.color = Color.black;
			turn = true;
		} else if (color.equalsIgnoreCase("white")) {
			this.color = Color.white;
			turn = false;
		}
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

	public boolean toggleTurn() {
		turn = !turn;
		return turn;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
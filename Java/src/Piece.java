import java.util.ArrayList;
import java.util.HashMap;

public abstract class Piece {
	StringBuffer position;
	HashMap<StringBuffer, Object> board = new HashMap<StringBuffer, Object>();
	public abstract ArrayList<StringBuffer> getPosition();
	public abstract void move(String spacesForwards, String spacesRight);
	public abstract void removeFromBoard();
	public abstract void setPosition(StringBuffer position);
}

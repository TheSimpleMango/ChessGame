import java.util.ArrayList;
import java.util.HashMap;

public class Piece extends Tile{
	Position position;
	int spacesAbleToMoveForwards;
	int spacesAbleToMoveRight;
	int spacesAbleToMoveBackwards;
	int spacesAbleToMoveLeft;//Board spaces are numbered from 1 to 64 starting in the bottom left corner and ending in the top corner. At the
	public Piece() {
		
	}
	
	public boolean getColor()
	{
		return true;
	}

	public Position getPosition() {
		// TODO Auto-generated method stub
		return position;
	}
}

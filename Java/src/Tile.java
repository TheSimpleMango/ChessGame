
public class Tile {

	private boolean isOccupied;
	private Position p;
	
	
	public Tile(){
		
	}
	
	public Tile(Position position) {
		this.p = position;
	}

	public boolean getOccupation(){
		return isOccupied;
	}
	
	public void setOccupation(boolean b){
		isOccupied = true;
	}

	public Position getPosition() {
		return p;
	}

	public void setPosition(Position p) {
		this.p = p;
	}
	
}

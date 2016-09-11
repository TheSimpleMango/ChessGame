import javax.swing.JButton;

<<<<<<< HEAD
public class Tile extends JButton{

	private boolean isOccupied;
	int x, y;
	
	public Tile(int x, int y){
		super();

public class Tile extends JButton {

	private boolean isOccupied;
	int x;
	int y;
	
	
	public Tile(int x, int y){

		this.x = x;
		this.y = y;
	}

	public boolean getOccupation(){
		return isOccupied;
	}
	
	public void setOccupation(boolean b){
		isOccupied = true;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

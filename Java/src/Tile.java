import javax.swing.JButton;

public class Tile extends JButton{

	private boolean isOccupied;
	int x, y;
	
	public Tile(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
	
	public boolean getOccupation(){
		return isOccupied;
	}
	
	public void setOccupation(boolean b){
		isOccupied = true;
	}
	
}

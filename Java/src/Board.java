import java.awt.Graphics;

import javax.swing.JButton;

public class Board {

	public JButton[][] buttons = new JButton[8][8];
	public Tile[][] tiles = new Tile[8][8];
	
	public Board(){
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				buttons[i][j] = new JButton();
			}
		}
	}

	public void update(){
		
	}
	
	public boolean isOccupied(int x, int y){
		if(tiles[x][y].getOccupation()){
			return true;
		}
		else
			return false;
	}
	
}

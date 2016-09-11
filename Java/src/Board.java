import java.awt.Graphics;

import javax.swing.JButton;

public class Board {
<<<<<<< HEAD

	public Tile[][] buttons = new Tile[8][8];
=======
	
	public JButton[][] tiles = new Tile[8][8];
>>>>>>> TheSimpleMango/master
	
	public Board(){
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
<<<<<<< HEAD
				buttons[i][j] = new Tile(i, j);
				
=======
				tiles[i][j] = new Tile(i, j);
>>>>>>> TheSimpleMango/master
			}
		}
		
	}

	public void update(){
		
	}
	
	public boolean isOccupied(int x, int y){
<<<<<<< HEAD
		if(buttons[x][y].isEnabled()){
=======
		if(((Tile) tiles[x][y]).getOccupation()){
>>>>>>> TheSimpleMango/master
			return true;
		}
		else
			return false;
	}
	
	
}

import java.awt.Graphics;

import javax.swing.JButton;

public class Board {

	public JButton[][] tiles = new JButton[8][8];
	
	public Board(){
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				tiles[i][j] = new JButton();
			}
		}
	}

	public void update(){
		
	}
	
}

import java.awt.Graphics;

import javax.swing.JButton;

public class Board {


	public Tile[][] buttons = new Tile[8][8];

	
	

	
	public Board(){
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){

				buttons[i][j] = new Tile(i, j);
				

				

			}
		}
		
	}

	public void update(){
		
	}
	
	public void startPositions(){
		Piece p;
		// other pieces
			for (int i = 1; i < 4; i++) {
				p = (Piece) buttons[1][i];
				p.setTypeOfPiece(i);
				p = (Piece) buttons[1][i + 7];
				p.setTypeOfPiece(i);
				p = (Piece) buttons[8][i];
				p.setTypeOfPiece(i);
				p = (Piece) buttons[8][i + 7];
				p.setTypeOfPiece(i);
			}
			//pawns
			for (int i = 0; i < buttons.length; i++) {
				
			}
			// queen / king
			
	}
	
	public boolean isOccupied(int x, int y){

		if(buttons[x][y].isEnabled()){

		/*if(((Tile) buttons[x][y]).getOccupation()){

			return true;
		}
		else
			return false;
			*/
	}
	
	
}

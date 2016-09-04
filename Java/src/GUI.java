import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements MouseListener {
	JFrame f = new JFrame("Chess");
	JPanel p = new JPanel(new GridLayout(8, 8));
	JLabel bL = new JLabel();
	Board b = new Board();
	
	public GUI() {
		//add board
		f.add(p);
		f.pack();
		p.addMouseListener(this);
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Tile t = (Tile) e.getSource();
		if(t.getOccupation() == true){
			
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	
}

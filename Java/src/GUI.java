import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GUI extends JFrame implements MouseListener, ActionListener{
	JPanel p = new JPanel(new GridLayout(8, 8));
	JButton b11 = new JButton();
	Board b = new Board();
	Timer t = new Timer(100, this);
	Boolean hasPiece = false;
	
	public GUI() {
		this.add(p);
		this.pack();
		p.addMouseListener(this);
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Button t = (Button) e.getSource();
		if(t.getOccupation() == true){
			hasPiece = true;
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

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	
	
	
}

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GUI extends JFrame implements MouseListener, ActionListener{
	JPanel p = new JPanel(new GridLayout(8, 8));
	Board b = new Board();
	Timer t = new Timer(100, this);
	Boolean hasPiece = false;
	
	public GUI() throws IOException {
		Image blackTile = ImageIO.read(getClass().getResource("Dark.png"));
		Image whiteTile = ImageIO.read(getClass().getResource("Light.png"));
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				b.tiles[i][j].setPreferredSize(new Dimension(50, 50));
				p.add(b.tiles[i][j]);
				if ((i + j) % 2 == 0) {
					b.tiles[i][j].setIcon(new ImageIcon(whiteTile));
				}
				else {
					b.tiles[i][j].setIcon(new ImageIcon(blackTile));
				}
			}
		}
		this.add(p);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.pack();
		p.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		JButton t = (JButton) e.getSource();
		System.out.println(t);
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

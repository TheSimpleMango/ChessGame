import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GUI extends JFrame implements MouseListener, ActionListener{
	JPanel p = new JPanel(new GridLayout(8, 8));
	Board b = new Board();
	Timer t = new Timer(100, this);
	Boolean hasPiece = false;
	int selectedPieceX;
	int selectedPieceY;

	public GUI(Player play1, Player play2) throws IOException {
		Image blackTile = ImageIO.read(getClass().getResource("Dark.png"));
		Image whiteTile = ImageIO.read(getClass().getResource("Light.png"));
		
		this.setTitle(play1.getName() + " vs. " + play2.getName());
		this.add(p);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	    
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				b.tiles[i][j].setPreferredSize(new Dimension(50, 50));
				b.tiles[i][j].addMouseListener(this);
				p.add(b.tiles[i][j]);
				if ((i + j) % 2 == 0) {
					b.tiles[i][j].setIcon(new ImageIcon(whiteTile));
				} else {
					b.tiles[i][j].setIcon(new ImageIcon(blackTile));
				}
			}
		}
		this.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Tile tile = (Tile) e.getSource();
		System.out.println(tile);
		if (!hasPiece) {
			if (tile.getOccupation()) {
				hasPiece = true;
				selectedPieceX = tile.getX();
				selectedPieceY = tile.getY();
			}
		}else{
			if (false/*other stuff*/) {
				hasPiece = false;
			}else {
				hasPiece = false;
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
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
/*
	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if (hasPiece) {
			Position mousePiecePosition = new Position(e.getX(), e.getY());
		}
	}*/
}
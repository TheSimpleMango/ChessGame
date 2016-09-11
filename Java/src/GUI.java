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
	Position mousePiecePosition = new Position();
	final mouseImageComponent mIC;

	public GUI() throws IOException {
		Image blackTile = ImageIO.read(getClass().getResource("Dark.png"));
		Image whiteTile = ImageIO.read(getClass().getResource("Light.png"));
		mIC = new mouseImageComponent();
		
		this.add(p);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	    JLayeredPane layeredPane = this.getRootPane().getLayeredPane();
	    layeredPane.add(mIC, JLayeredPane.DRAG_LAYER);
	    mIC.setBounds(0, 0, this.getWidth(), this.getHeight());
	    
	    // add this to every single damn button if i have to
	    // make a button class godam it
		this.addMouseMotionListener(new MouseMotionAdapter() {
		      public void mouseMoved(MouseEvent me)
		      {
		        mIC.x = me.getX();
		        mIC.y = me.getY();
		        mIC.repaint();
		      }
		});
		
	    this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
	    
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				b.buttons[i][j].setPreferredSize(new Dimension(50, 50));
				b.buttons[i][j].addMouseListener(this);
				p.add(b.buttons[i][j]);
				if ((i + j) % 2 == 0) {
					b.buttons[i][j].setIcon(new ImageIcon(whiteTile));
				} else {
					b.buttons[i][j].setIcon(new ImageIcon(blackTile));
				}
			}
		}
		this.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JButton button = (JButton) e.getSource();
		Tile tile = new Tile(new Position(1,1));
		System.out.println(tile);
		if (!hasPiece) {
			if (tile.getOccupation()) {
				hasPiece = true;
				mousePiecePosition = tile.getPosition();
			}
		}else{
			if (mousePiecePosition == tile.getPosition()) {
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

class mouseImageComponent extends JComponent
{
  public int x;
  public int y;
  
  public mouseImageComponent() {
    this.setBackground(Color.blue);
  }
  
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    String s = x + ", " + y;
    g.setColor(Color.red);
    g.drawString(s, x, y);
  }
}
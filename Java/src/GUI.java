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
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI extends JFrame implements MouseListener, ActionListener{
	JPanel p = new JPanel(new GridLayout(8, 8));
	JMenuBar menus = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenuItem save = new JMenuItem("Save");
	JMenuItem rename = new JMenuItem("Change Names");
	JFileChooser filechooser = new JFileChooser();
	FileFilter filter = new FileNameExtensionFilter("CHESSX file", "chessx");
	Board b = new Board();
	Timer t = new Timer(100, this);
	Boolean hasPiece = false;
	int selectedPieceX;
	int selectedPieceY;

	public GUI(Player play1, Player play2) throws IOException {
		Image blackTile = ImageIO.read(getClass().getResource("Dark.png"));
		Image whiteTile = ImageIO.read(getClass().getResource("Light.png"));

		this.setJMenuBar(menus);
		save.addActionListener(this);
		rename.addActionListener(this);
		menus.add(file);
		file.add(save);
		file.add(rename);
		
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
		System.out.println(tile.x);
		System.out.println(tile.y);
		if (!hasPiece) {
			if (tile.getOccupation()) {
				hasPiece = true;
				selectedPieceX = tile.getX();
				selectedPieceY = tile.getY();
			}
		}else{
			if (false) {
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
		if(e.getSource() == save){
			System.out.println("Saving game...");
			save();
		}else if(e.getSource() == rename){
			System.out.println();
		}else{
			repaint();
		}
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
	public void save(){
		//TODO: Insert save code, future update. BEING WORKED ON!
		filechooser.setCurrentDirectory(new File("/Users/League/Desktop"));
		filechooser.setDialogTitle("Save...");
		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		filechooser.setFileFilter(filter);
		filechooser.removeChoosableFileFilter(filechooser.getAcceptAllFileFilter());
		if(filechooser.showSaveDialog(save) == JFileChooser.APPROVE_OPTION){
			
		}
		System.out.println("Path to save location: " + filechooser.getSelectedFile().getAbsolutePath());
	}
}
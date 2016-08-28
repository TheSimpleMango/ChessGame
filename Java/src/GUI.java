import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements MouseListener {
	JFrame f = new JFrame("Chess");
	JPanel p = new JPanel(new GridLayout(8, 8));
	ArrayList<JLabel> l = new ArrayList<>();
	Board b = new Board();
	
	public GUI() {
		for (Tile t : b.tiles) {
			l.add(new JLabel(t.))
		}
		f.add(p);
		p.add(bL);
		f.pack();
		p.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		e.getSource()
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

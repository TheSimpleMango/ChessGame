import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements MouseListener {
	JFrame f = new JFrame("Chess");
	JPanel p = new JPanel(new BorderLayout());
	JLabel bL = new JLabel();
	
	public GUI() {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	
}

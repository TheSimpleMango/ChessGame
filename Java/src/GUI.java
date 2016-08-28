import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
	JFrame f = new JFrame("Chess");
	JPanel p = new JPanel();
	Board b = new Board();
	
	public GUI() {
		f.add(p);
		p.add(b);
	}
}

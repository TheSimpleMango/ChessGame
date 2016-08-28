import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
	JFrame f = new JFrame("Chess");
	JPanel p = new JPanel();
	
	public GUI() {
		f.add(p);
		f.pack();
	}
}

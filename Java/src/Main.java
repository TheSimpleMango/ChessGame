<<<<<<< HEAD
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Player black = new Player(JOptionPane.showInputDialog("Please enter name of player 1"));
		Player white = new Player(JOptionPane.showInputDialog("Please enter name of player 2"));
=======
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
>>>>>>> TheSimpleMango/master
		GUI g = new GUI();
	}
}
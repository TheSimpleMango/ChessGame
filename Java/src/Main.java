import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) throws IOException {
		Player black = new Player(JOptionPane.showInputDialog("Please enter name of player 1"));
		Player white = new Player(JOptionPane.showInputDialog("Please enter name of player 2"));
		GUI g = new GUI();
	}
}